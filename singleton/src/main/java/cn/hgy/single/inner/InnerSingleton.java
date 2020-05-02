package cn.hgy.single.inner;

import cn.hgy.single.doublecheck.DoubleCheckSingleton;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class InnerSingleton {

    private InnerSingleton(){}

    public static InnerSingleton getInstance() {
        return Singleton.instance;
    }

    private static class Singleton{
        private static final InnerSingleton instance = new InnerSingleton();
    }
}
