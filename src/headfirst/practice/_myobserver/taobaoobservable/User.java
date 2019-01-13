package com.design.observer.taobaoobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jerry
 * @create 17/9/28 15:15
 */
public class User implements Observer, DisplayElement {
    private int sumCashCoupon = 0;
    private String name = "CommonUser";

    public User(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Taobao) {
            Taobao taobao = (Taobao)o;
            sumCashCoupon += taobao.getCurCashCoupon();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("User " + name + " have cashCoupon: " + sumCashCoupon);
    }
}
