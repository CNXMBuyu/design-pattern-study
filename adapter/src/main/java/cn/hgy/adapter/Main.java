package cn.hgy.adapter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        NewParameter parameter = new NewParameter();
        parameter.setNewA("a");
        parameter.setNewB("b");
        new ClassAdapter().invoke(parameter);
        new ObjectAdapter().invoke(parameter);
    }
}
