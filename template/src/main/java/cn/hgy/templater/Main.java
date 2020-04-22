package cn.hgy.templater;

import javafx.util.Callback;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
//        FlowNode flowNode = new FlowNode();
//        flowNode.invoke(new FlowCallback());

        Float f1 = new Float(1);
        Float f2 = new Float(1);

        Integer i1 = new Integer(1);
        Integer i2 = 1;

        String s1 = "a";
        String s2 = "a";

        System.out.println(f1 == f2);
        System.out.println(i1 == i2);
        System.out.println(s1 == s2);
    }
}
