package cn.hgy.observer.demo;

import cn.hgy.observer.EventBus;
import cn.hgy.observer.EventBusAsync;
import cn.hgy.observer.ObserverRegistry;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        EventBus eventBus = new EventBusAsync();
        eventBus.register(new Observer());
        eventBus.register(new ObserverA());
        eventBus.post(new Message("message"));
    }
}
