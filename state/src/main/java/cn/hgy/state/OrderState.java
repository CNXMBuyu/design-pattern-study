package cn.hgy.state;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public interface OrderState {

    default void agree(OrderStateMachine orderStateMachine){
        // nothing
    }

    default void reject(OrderStateMachine orderStateMachine){
        // nothing
    }
}
