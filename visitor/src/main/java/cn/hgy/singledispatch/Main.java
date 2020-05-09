package cn.hgy.singledispatch;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentChildren = new Children();
        Children children = new Children();

        // 思考下，编译器会定义几个方法？
        parent.show(parentChildren);
        parentChildren.show(parent);
        parentChildren.show(children);
        children.show(parent);
    }
}
