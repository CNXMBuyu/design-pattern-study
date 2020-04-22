package cn.hgy.command;

/**
 * 开灯的命令
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
