package cn.hgy.decorator;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class BusinessService implements IBusinessService{

    public void invoke(){
        System.out.println("invoke");
    }

    public void invoke2() {
        System.out.println("invoke2");
    }
}
