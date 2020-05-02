package cn.hgy.simplefactory;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class SimpleFactory {

    public BaseClass getClass(String type) {
        String classAType = "classA";
        if (classAType.equals(type)) {
            return new ClassA();
        } else {
            return new ClassB();
        }
    }
}
