package cn.hgy.observer.classic;

import java.util.Observable;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        // java.util.Observable
        MyObservable observable = new MyObservable();
        observable.addObserver(new java.util.Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("A"+arg.toString());
                o.deleteObserver(this);
            }
        });

        observable.addObserver(new java.util.Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("B"+arg.toString());
            }
        });

        observable.setChanged();
        observable.notifyObservers("message1");
        observable.setChanged();
        observable.notifyObservers("message2");

    }
}
