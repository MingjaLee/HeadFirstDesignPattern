package com.design.decorator;

/**
 * @author jerry
 * @create 17/9/28 12:57
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("==关羽==");
        Hero gy = new GuanYu("关羽");
        System.out.println(gy.getDescription() + " attack:" + gy.attack());

        gy = new Sword(gy);
        System.out.println(gy.getDescription() + " attack:" + gy.attack());

        gy = new Ring(gy);
        System.out.println(gy.getDescription() + " attack:" + gy.attack());

        System.out.println("==刘备==");
        Hero liubei = new LiuBei("刘备");
        System.out.println(liubei.getDescription() + " attack:" + liubei.attack());

        liubei = new Sword(liubei);
        System.out.println(liubei.getDescription() + " attack:" + liubei.attack());

        liubei = new Ring(liubei);
        System.out.println(liubei.getDescription() + " attack:" + liubei.attack());

    }
}
