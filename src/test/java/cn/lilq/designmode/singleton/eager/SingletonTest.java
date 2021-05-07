package cn.lilq.designmode.singleton.eager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
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
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                list.add(EagerSingleton.getInstance());
            }).start();
        }
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
