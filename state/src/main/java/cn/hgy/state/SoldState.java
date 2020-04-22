package cn.hgy.state;

/**
 * 售出状态
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("正在发放糖果，请稍等");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在发放糖果，请稍等");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在发放糖果，请稍等");
    }

    @Override
    public void dispense() {

    }
}
