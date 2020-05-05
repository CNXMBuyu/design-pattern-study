package cn.hgy.observer.eventbus;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class ObserverA {

    @Subscribe
    public void registerMessage(Message message){
        System.out.println(Thread.currentThread().getName() + ". ObserverA. message : " + message.getContent());
    }
}
