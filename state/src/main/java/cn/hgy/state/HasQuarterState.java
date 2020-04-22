package cn.hgy.state;

/**
 * 有25分钱状态
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("已有25分钱，无需投入金钱");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("成功退出金钱");
        this.gumballMachine.setState(new HasQuarterState(gumballMachine));
    }

    @Override
    public void turnCrank() {
        System.out.println("成功购买糖果");
        this.gumballMachine.setState(new SoldState(gumballMachine));
    }

    @Override
    public void dispense() {
        System.out.println("异常操作");
    }
}
