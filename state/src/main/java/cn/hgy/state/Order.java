package cn.hgy.state;

/**
 * 数据库实体
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Order {

    private OrderStateEnum status =  OrderStateEnum.unpaid;

    public OrderStateEnum getStatus() {
        return status;
    }

    public void setStatus(OrderStateEnum status) {
        this.status = status;
    }
}
