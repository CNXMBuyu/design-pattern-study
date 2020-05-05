package cn.hgy.observer.eventbus;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Observer {

    @Subscribe
    public void registerMessage(Message message){
        System.out.println(Thread.currentThread().getName() + ". Observer. message : " + message.getContent());
    }
}
