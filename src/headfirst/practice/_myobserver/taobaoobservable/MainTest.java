package com.design.observer.taobaoobservable;

/**
 * @author jerry
 * @create 17/9/28 15:22
 */
public class MainTest {
    public static void main(String[] args) {
        Taobao taobao = new Taobao();
        User user = new User(taobao);
        VipUser vipUser = new VipUser(taobao);

        taobao.setCurCashCoupon(10);
        taobao.setCurCashCoupon(40);
    }
}
