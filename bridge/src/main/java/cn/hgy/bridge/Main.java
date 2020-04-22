package cn.hgy.bridge;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    private static String b = "a";
    private static String c = "a";

    public static void main(String[] args) {
        new Main().test();
    }


    private void test() {
        String a = "a";
        System.out.println(b == c);
        System.out.println(b == a);
    }
}
