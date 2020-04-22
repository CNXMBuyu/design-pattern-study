package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class DuckTest {

    public static void main(String[] args) {

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();
    }
}
