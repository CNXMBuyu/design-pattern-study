package cn.hgy.state;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        OrderStateMachine orderStateMachine = new OrderStateMachine(order);
        orderStateMachine.agree();
        System.out.println(orderStateMachine.getState().toString());
        orderStateMachine.agree();
        System.out.println(orderStateMachine.getState().toString());
    }
}
