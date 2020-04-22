package cn.hgy.templater;

import javafx.util.Callback;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class FlowCallback implements Callback<FlowNode, FlowTask> {
    @Override
    public FlowTask call(FlowNode param) {
        FlowTask flowTask = new FlowTask(param);
        flowTask.addTask();
        return flowTask;
    }
}
