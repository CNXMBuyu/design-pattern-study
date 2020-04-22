package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class FlyWithWing implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("展翅飞翔");
    }
}
