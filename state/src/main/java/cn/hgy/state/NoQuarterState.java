package cn.hgy.state;

/**
 * 没有25分钱的状态
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入25分钱");
        this.gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("当前没有钱，无法退出");
    }

    @Override
    public void turnCrank() {
        System.out.println("当前没有钱，无法购买");
    }

    @Override
    public void dispense() {
        System.out.println("当前没有钱，无法发放糖果");
    }
}
