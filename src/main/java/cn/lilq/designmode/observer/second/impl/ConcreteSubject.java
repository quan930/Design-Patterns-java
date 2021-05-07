package cn.lilq.designmode.observer.second.impl;

import cn.lilq.designmode.observer.second.Subject;

/**
 * @author Li Liangquan
 * @date 2019/7/31 11:29 PM
 */
public class ConcreteSubject extends Subject {
    private String data;
    public void change(String newData){
        data = newData;
        System.out.println("data change");
        notifyObservers();
    }
}
