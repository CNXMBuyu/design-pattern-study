package cn.hgy.state;

/**
 * 待支付
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class UnpaidOrderState implements OrderState {


    @Override
    public void agree(OrderStateMachine orderStateMachine) {
        // 处理已付款的相关事项
        // .....
        // 状态调整
        orderStateMachine.setState(new PaidOrderState());
    }

    @Override
    public void reject(OrderStateMachine orderStateMachine) {
        orderStateMachine.setState(new ClosedOrderState());
    }
}
