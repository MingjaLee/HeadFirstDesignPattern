package com.design.decorator;

/**
 * @author jerry
 * @create 17/9/28 12:54
 */
public class GuanYu extends Hero {

    public GuanYu(String desc) {
        this.description = desc;
    }

    @Override
    public int attack() {
        return 10;
    }
}
