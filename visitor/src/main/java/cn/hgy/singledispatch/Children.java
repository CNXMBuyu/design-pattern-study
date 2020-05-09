package cn.hgy.singledispatch;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Children extends Parent {

    public void show(Parent parent){
        System.out.println("Children.show(Parent)");
    }

    public void show(Children children){
        System.out.println("Children.show(Children)");
    }
}
