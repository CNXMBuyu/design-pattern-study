package cn.hgy.adapter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class OldInterfaceImpl implements OldInterface{

    @Override
    public void invoke(OldParameter parameter) {
        System.out.println(parameter.toString());
    }
}
