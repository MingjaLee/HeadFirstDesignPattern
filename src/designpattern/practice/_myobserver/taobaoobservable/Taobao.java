package com.design.observer.taobaoobservable;

import java.util.Observable;

/**
 * @author jerry
 * @create 17/9/28 15:08
 */
public class Taobao extends Observable {
    private int curCashCoupon;

    public Taobao() {}

    public void cashCouponChanged() {
        setChanged();
        notifyObservers();
    }

    public int getCurCashCoupon() {
        return curCashCoupon;
    }

    public void setCurCashCoupon(int curCashCoupon) {
        this.curCashCoupon = curCashCoupon;
        cashCouponChanged();
    }
}
