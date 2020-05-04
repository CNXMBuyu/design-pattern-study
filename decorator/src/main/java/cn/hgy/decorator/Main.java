package cn.hgy.decorator;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        IBusinessService businessService = new BusinessService();
        // 注意，这里传入的实参
        IBusinessService operationService = new OperationService(businessService);
        operationService.invoke();
    }
}
