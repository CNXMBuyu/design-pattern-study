package cn.hgy.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Prototype {

    public static void main(String[] args) {

        List<ClassA> list = new ArrayList<>();
        list.add(new ClassA("a1", "b1"));
        list.add(new ClassA("a2", "b2"));

        List<ClassA> shallow = new Shallow(list).getList();
        List<ClassA> deep = new Deep(list).getList();


        list.get(0).setA("new a1");

        System.out.println("shallow foreach");
        shallow.forEach(classA -> {
            System.out.println(classA.toString());
        });

        System.out.println("deep foreach");
        deep.forEach(classA -> {
            System.out.println(classA.toString());
        });
    }

}
