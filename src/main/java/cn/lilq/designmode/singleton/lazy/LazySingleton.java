package cn.lilq.designmode.singleton.lazy;

/**
 * @auther: Li Liangquan
 * @date: 2021/5/7 21:29
 * 懒汉单例模式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton=null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
