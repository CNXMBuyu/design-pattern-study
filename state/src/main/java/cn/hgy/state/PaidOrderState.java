package cn.hgy.state;

/**
 * 已支付
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class PaidOrderState implements OrderState {

    @Override
    public void agree(OrderStateMachine orderStateMachine) {
        orderStateMachine.setState(new FinishOrderState());
    }

    @Override
    public void reject(OrderStateMachine orderStateMachine) {
            orderStateMachine.setState(new RefundedOrderState());
    }
}
