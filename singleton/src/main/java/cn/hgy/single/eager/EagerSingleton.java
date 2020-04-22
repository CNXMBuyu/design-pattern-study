package cn.hgy.single.eager;

/**
 * 饿汉单例模式，先实例化
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
