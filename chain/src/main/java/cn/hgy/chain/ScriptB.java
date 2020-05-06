package cn.hgy.chain;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ScriptB extends  AbstractScript {

    @Override
    protected int sort() {
        return 3;
    }

    @Override
    public void doInit() {
        System.out.println(this.getClass().getName());
    }
}
