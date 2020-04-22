package cn.hgy.proxy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class BusinessServiceProxy implements IBusinessService{

    private OperationService operationService = new OperationService();
    private IBusinessService businessService = new BusinessService();

    @Override
    public void invoke() {
        businessService.invoke();
        operationService.record();
    }

    @Override
    public void invoke2() {
        businessService.invoke2();
    }
}
