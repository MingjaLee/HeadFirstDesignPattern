package com.design.observer.taobao;

/**
 * @author jerry
 * @create 17/9/28 14:46
 */
public class VipUser implements Observer, DisplayElement {
    private String name = "Vip User";
    private int sumCashCoupon = 0;
    private Taobao taobao;

    public VipUser(Taobao taobao) {
        this.taobao = taobao;
        this.taobao.registerObserver(this);
    }

    @Override
    public void update(int cashCoupon) {
        sumCashCoupon += 2 * cashCoupon;
        display();
    }

    @Override
    public void display() {
        System.out.println("VipUser " + name + " have cashCoupon: " + sumCashCoupon);
    }
}
