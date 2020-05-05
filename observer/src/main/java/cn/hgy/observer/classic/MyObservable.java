package cn.hgy.observer.classic;

import java.util.Observable;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class MyObservable extends Observable {

    public synchronized void setChanged() {
        super.setChanged();
    }
}
