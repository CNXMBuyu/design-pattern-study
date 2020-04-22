package cn.hgy.builder;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        BuilderClass.Builder builder = new BuilderClass.Builder();
        BuilderClass builderClass = builder.setA("a").setB("b").setC("c").setD("d").build();
        System.out.println(builderClass.toString());
    }
}
