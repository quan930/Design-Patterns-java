package cn.lilq.designmode.observer.first;

/**
 * @author Li Liangquan
 * @date 2019/7/31 8:34 PM
 */
public class ConcreteObserver  implements Observer{
    public void update() {
        System.out.println("I am notified");
    }
}
