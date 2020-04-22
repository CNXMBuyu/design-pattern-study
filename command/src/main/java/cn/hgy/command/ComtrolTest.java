package cn.hgy.command;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ComtrolTest {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        SimpleControl simpleControl = new SimpleControl(lightOnCommand);

        // 按下遥控器按钮
        simpleControl.buttonWasPressed();
    }
}
