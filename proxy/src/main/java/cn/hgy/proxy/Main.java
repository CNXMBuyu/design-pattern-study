package cn.hgy.proxy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        IBusinessService businessServiceProxy = new BusinessServiceProxy();
        businessServiceProxy.invoke2();

        IBusinessService businessService = (IBusinessService) new BusinessServiceDynamicProxy().createProxy(new BusinessService());
        businessService.invoke2();
    }
}
