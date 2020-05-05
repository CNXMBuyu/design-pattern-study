package cn.hgy.observer.eventbus;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class EventBusAsync extends EventBus {

    public EventBusAsync() {
        super(new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1)));
    }
}
