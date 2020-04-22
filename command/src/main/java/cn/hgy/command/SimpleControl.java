package cn.hgy.command;

/**
 * 命令调用者 - 控制器
 *
 * @author guoyu.huang
 * @version 1.0.0
 */
public class SimpleControl {

    private Command command;

    public SimpleControl(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
