package com.design.observer.taobao;

/**
 * @author jerry
 * @create 17/9/28 13:43
 */

/**
 * 订阅淘宝, 会发代金券给订阅者, vip订阅者可以得到双倍的代金券。
 */
public class MainTest {
    public static void main(String[] args) {
        Taobao taobao = new Taobao();
        User jerry = new User(taobao);
        VipUser tom = new VipUser(taobao);

        taobao.setCurCashCoupon(10);
        taobao.setCurCashCoupon(20);
    }
}
