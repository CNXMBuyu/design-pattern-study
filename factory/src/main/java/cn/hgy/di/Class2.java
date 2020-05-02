package cn.hgy.di;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Class2 {

    private String a;
    private String b;

    public Class2(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println(a + b);
    }
}
