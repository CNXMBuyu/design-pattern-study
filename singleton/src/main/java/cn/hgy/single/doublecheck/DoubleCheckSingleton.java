package cn.hgy.single.doublecheck;

/**
 * 双重校验单例模式
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                instance = new DoubleCheckSingleton();

            }
        }
        return instance;
    }
}
