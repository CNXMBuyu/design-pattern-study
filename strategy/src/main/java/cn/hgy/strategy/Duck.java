package cn.hgy.strategy;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(){

    }

    public Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    /**
     * 外观
     */
    public abstract void display();

    public void fly(){
        this.flyBehavior.fly();
    }

    public void quack(){
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
