package cn.hgy.adapter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class OldParameter {

    private String a;
    private String b;

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
        return "OldParameter{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
