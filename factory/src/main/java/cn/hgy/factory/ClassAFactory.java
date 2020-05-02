package cn.hgy.factory;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ClassAFactory extends BaseFactory {

    private static final String CLASS_A_TYPE = "classA";

    @Override
    public boolean handle(String type) {
        return CLASS_A_TYPE.equals(type);
    }

    @Override
    public BaseClass create() {
        return new ClassA();
    }
}
