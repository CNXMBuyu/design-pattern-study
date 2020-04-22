package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        super(new FlyWithWing(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("红头鸭子");
    }
}
