package cn.hgy.di;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Class1 {

    private Class2 class2;

    public Class1(Class2 class2){
        this.class2 = class2;
    }

    public void show(){
        System.out.println("show");
    }
}
