package cn.hgy.factory;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public abstract class BaseFactory {

    protected abstract boolean handle(String type);

    public abstract BaseClass create();
}
