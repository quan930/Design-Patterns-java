package cn.lilq.designmode.singleton.lazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/7 21:34
 */
public class LazySingletonTest {
    List<LazySingleton> list;
    @Before
    public void before(){
        int threadCount = 10;
        list = new CopyOnWriteArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount; i++) {
            fixedThreadPool.execute(()->{
                try {
                    countDownLatch.await();
                    list.add(LazySingleton.getInstance());
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
//            System.out.println(eagerSingleton.hashCode());
        });
        Assert.assertTrue(b.get());
    }
}
