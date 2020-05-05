package cn.hgy.observer.eventbus;

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
