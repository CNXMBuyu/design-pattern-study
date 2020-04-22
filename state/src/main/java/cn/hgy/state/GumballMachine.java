package cn.hgy.state;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class GumballMachine{

    private State state;
    private int count;

    public GumballMachine(int count){
        this.count = count;
        if(count  > 0){
            setState(new NoQuarterState(this));
        }else{
            setState(new SoldOutState(this));
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

}
