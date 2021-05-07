package cn.lilq.designmode.observer.first;

import cn.lilq.designmode.observer.first.impl.ConcreteObserver;
import cn.lilq.designmode.observer.first.impl.MySubject;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Li Liangquan
 * @date 2019/7/31 10:35 PM
 */
public class ObserverTest {
    Observer observerA;
    Observer observerB;
    MySubject subject;

    @Before
    public void before(){
        observerA = new ConcreteObserver();
        observerB = new ConcreteObserver();
        subject = new MySubject();
        subject.attach(observerA);
        subject.attach(observerB);
    }
    @Test
    public void testObserver(){
        subject.change();
    }
}
