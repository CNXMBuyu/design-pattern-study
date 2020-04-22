package cn.hgy.state;

/**
 * 糖果机状态接口
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public interface State {

    /**
     * 投入金钱
     */
    void insertQuarter();

    /**
     * 退出金钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄/确认购买
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();

}
