package cn.hgy.command;

/**
 * 关灯的命令
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
