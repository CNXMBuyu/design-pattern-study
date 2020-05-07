package cn.hgy.state;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class OrderStateMachine {

    private OrderState state;

    private static Map<OrderStateEnum, OrderState> orderStateMap = new HashMap<>(10);

    static{
        orderStateMap.put(OrderStateEnum.unpaid, new UnpaidOrderState());
        orderStateMap.put(OrderStateEnum.closed, new ClosedOrderState());
        orderStateMap.put(OrderStateEnum.paid, new UnpaidOrderState());
        orderStateMap.put(OrderStateEnum.refund, new RefundedOrderState());
        orderStateMap.put(OrderStateEnum.finish, new FinishOrderState());
    }

    public OrderStateMachine(Order order){
        state = orderStateMap.get(order.getStatus());
    }

    public void agree(){
        state.agree(this);
    }

    public void reject(){
        state.reject(this);
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
