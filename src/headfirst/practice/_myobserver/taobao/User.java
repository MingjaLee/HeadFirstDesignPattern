package com.design.observer.taobao;

/**
 * @author jerry
 * @create 17/9/28 14:41
 */
public class User implements Observer, DisplayElement {
    private String name = "Common User";
    private int sumCashCoupon = 0;
    Taobao taobao;
    public User(Taobao taobao) {
        this.taobao = taobao;
        this.taobao.registerObserver(this);
    }

    @Override
    public void update(int cashCoupon) {
        sumCashCoupon += cashCoupon;
        display();
    }

    @Override
    public void display() {
        System.out.println("User " + name + " have cashCoupon: " + sumCashCoupon);
    }
}
