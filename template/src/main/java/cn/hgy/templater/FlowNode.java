package cn.hgy.templater;


import javafx.util.Callback;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class FlowNode {

    public void invoke(Callback callback) {
        FlowNode flowNode = new FlowNode();
        callback.call(flowNode);
    }
}
