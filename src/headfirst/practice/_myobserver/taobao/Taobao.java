package com.design.observer.taobao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jerry
 * @create 17/9/28 14:55
 */
public class Taobao implements Subject {
    private int curCashCoupon;
    private List<Observer> subscribers;

    public Taobao() {
        subscribers = new ArrayList<>();
    }

    public void setCurCashCoupon(int curCashCoupon) {
        this.curCashCoupon = curCashCoupon;
        cashCouponChanged();
    }

    public void cashCouponChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = subscribers.indexOf(o);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : subscribers) {
            o.update(curCashCoupon);
        }
    }
}
