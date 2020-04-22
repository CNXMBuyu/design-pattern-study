package cn.hgy.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator iterator1 = list.iterator();
        Iterator iterator2 = list.iterator();
        iterator1.next();
        iterator1.remove();
        System.out.println(iterator2.next()); // 运行结果？
    }
}
