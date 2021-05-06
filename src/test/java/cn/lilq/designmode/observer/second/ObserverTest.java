package cn.lilq.designmode.observer.second;

import org.junit.Before;
import org.junit.Test;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/6 21:04
 */
public class ObserverTest {
    Observer observerA;
    Observer observerB;
    ConcreteSubject subject;

    @Before
    public void before(){
        observerA = new ConcreteObserver();
        observerB = new ConcreteObserver();
        subject = new ConcreteSubject();
        subject.attach(observerA);
        subject.attach(observerB);
    }
    @Test
    public void testObserver(){
        subject.change("test");
    }
}

