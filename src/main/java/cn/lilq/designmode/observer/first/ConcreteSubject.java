package cn.lilq.designmode.observer.first;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Li Liangquan
 * @date 2019/7/29 8:29 PM
 */
public class ConcreteSubject implements Subject{
    private Vector observersVector = new Vector();

    public void attach(Observer observer) {
        observersVector.addElement(observer);
    }

    public void detach(Observer observer) {
        observersVector.removeElement(observer);
    }

    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((Observer)enumeration.nextElement()).update();
        }
    }
    private Enumeration observers(){
        return ((Vector)observersVector.clone()).elements();
    }
}