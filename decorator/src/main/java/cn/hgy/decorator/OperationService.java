package cn.hgy.decorator;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class OperationService implements IBusinessService {

    private IBusinessService businessService;

    // 这里通过构造函数参数
    public OperationService(IBusinessService businessService) {
        this.businessService = businessService;
    }

    @Override
    public void invoke() {
        businessService.invoke();
        // 增强功能
        System.out.println("operation");
    }

    @Override
    public void invoke2() {
        businessService.invoke2();
    }
}
