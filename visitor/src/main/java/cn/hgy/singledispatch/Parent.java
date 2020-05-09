package cn.hgy.singledispatch;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Parent {

    public void show(Parent parent){
        System.out.println("Parent.show(Parent)");
    }

    public void show(Children children){
        System.out.println("Parent.show(Children)");
    }
}
