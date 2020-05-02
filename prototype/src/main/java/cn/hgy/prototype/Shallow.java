package cn.hgy.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Shallow {

    private List<ClassA> list;

    public Shallow(List<ClassA> list){
        this.list = Arrays.asList(list.toArray(new ClassA[list.size()]).clone());
    }

    public List<ClassA> getList() {
        return list;
    }

}
