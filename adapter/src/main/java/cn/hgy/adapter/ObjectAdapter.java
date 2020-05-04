package cn.hgy.adapter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ObjectAdapter implements NewInterface {

    private OldInterface oldInterface = new OldInterfaceImpl();

    @Override
    public void invoke(NewParameter parameter) {
        OldParameter oldParameter = new OldParameter();
        oldParameter.setA(parameter.getNewA());
        oldParameter.setB(parameter.getNewB());
        oldInterface.invoke(oldParameter);
    }
}
