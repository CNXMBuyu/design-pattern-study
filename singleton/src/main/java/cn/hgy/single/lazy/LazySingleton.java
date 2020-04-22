package cn.hgy.single.lazy;

/**
 * 懒汉单例模式，需要的时候实例化
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            return new LazySingleton();
        } else {
            return instance;
        }
    }
}
