package cn.hgy.proxy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class BusinessService implements IBusinessService{

    public void invoke(){
        System.out.println("invoke");
    }

    @Override
    public void invoke2() {
        System.out.println("invoke2");
    }
}
