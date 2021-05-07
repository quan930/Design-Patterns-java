package cn.lilq.designmode.singleton.eager;

import cn.lilq.designmode.singleton.lazy.LazySingleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/7 21:16
 */
public class SingletonTest {
    List<EagerSingleton> list;
    @Before
    public void before(){
        list = new CopyOnWriteArrayList<>();
        int threadCount = 10;
        list = new CopyOnWriteArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount; i++) {
            fixedThreadPool.execute(()->{
                try {
                    countDownLatch.await();
                    list.add(EagerSingleton.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        countDownLatch.countDown();
        fixedThreadPool.shutdown();
        while (!fixedThreadPool.isTerminated()){ }
    }

    @Test
    public void test(){
        int hashCode = list.get(0).hashCode();
        AtomicBoolean b = new AtomicBoolean(true);
        list.forEach(eagerSingleton -> {
            if (hashCode!=eagerSingleton.hashCode()){
                b.set(false);
            }
        });
        Assert.assertTrue(b.get());
    }
}
