package cn.hgy.command;

/**
 * 命令接收者 - 灯
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Light {

    public void on() {
        System.out.println("灯亮了");
    }

    public void off() {
        System.out.println("灯暗了");
    }
}
