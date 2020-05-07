package cn.hgy.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Queue<Command> request = new LinkedList<>();
        Light light = new Light();
        request.add(new LightOnCommand(light));
        request.add(new LightOffCommand(light));

        request.forEach(command -> {
            command.execute();
        });
    }
}
