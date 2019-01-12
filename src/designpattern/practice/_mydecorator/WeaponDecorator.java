package com.design.decorator;

/**
 * @author jerry
 * @create 17/9/28 12:50
 */
public abstract class WeaponDecorator extends Hero {
    protected  Hero hero;
    public abstract String getDescription();
}
