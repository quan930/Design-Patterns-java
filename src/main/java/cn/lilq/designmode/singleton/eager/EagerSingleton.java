package cn.lilq.designmode.singleton.eager;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/7 20:57
 * 饿汉式单例类
 */
public class EagerSingleton {
    //饿汉式单例类.在类初始化时，已经自行实例化
    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON;
    }
}
