package com.design.observer.taobaoobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jerry
 * @create 17/9/28 15:25
 */
public class VipUser implements Observer, DisplayElement {
    private String name = "VipUser";
    private int sumCashCoupon = 0;

    public VipUser(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("VipUser " + name + " have cashCoupon: " + sumCashCoupon);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Taobao) {
            Taobao taobao = (Taobao) o;
            sumCashCoupon += 2 * taobao.getCurCashCoupon();
            display();
        }
    }
}
