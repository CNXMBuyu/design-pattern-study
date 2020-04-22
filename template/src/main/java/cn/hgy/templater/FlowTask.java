package cn.hgy.templater;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class FlowTask {

    private FlowNode flowNode;

    public FlowTask(FlowNode flowNode){
        this.flowNode = flowNode;
    }

    public void addTask(){
        System.out.println("add task" + flowNode.toString());
    }
}
