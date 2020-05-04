package cn.hgy.adapter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ClassAdapter extends OldInterfaceImpl implements NewInterface{

    @Override
    public void invoke(NewParameter parameter) {
        OldParameter oldParameter = new OldParameter();
        oldParameter.setA(parameter.getNewA());
        oldParameter.setB(parameter.getNewB());
        super.invoke(oldParameter);
    }
}
