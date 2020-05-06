package cn.hgy.chain;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ScriptA extends  AbstractScript {

    @Override
    protected int sort() {
        return 2;
    }

    @Override
    public void doInit() {
        System.out.println(this.getClass().getName());
    }
}
