package cn.lilq.designmode.observer.first.impl;

/**
 * @author Li Liangquan
 * @date 2019/7/31 10:49 PM
 */
public class MySubject extends ConcreteSubject {
    public void change(){
        System.out.println("data change...");
        notifyObservers();
    }
}
