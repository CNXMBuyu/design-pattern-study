package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱");
    }
}
