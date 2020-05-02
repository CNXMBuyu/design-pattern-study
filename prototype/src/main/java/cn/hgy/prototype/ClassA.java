package cn.hgy.prototype;

import java.io.Serializable;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ClassA implements Serializable {

    private String a;
    private String b;

    public ClassA(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

}
