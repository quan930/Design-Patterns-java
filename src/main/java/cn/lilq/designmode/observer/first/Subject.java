package cn.lilq.designmode.observer.first;

/**
 * @author Li Liangquan
 * @date 2019/7/29 8:13 PM
 */
public interface Subject {
    /**
     * 注册一个新的观察者对象
     * @param observer 观察者
     */
    void attach(Observer observer);

    /**
     * 删除该观察者
     * @param observer 要删除的观察者对象
     */
    void detach(Observer observer);

    /**
     * 通知全部已经注册过的观察者
     */
    void notifyObservers();
}
