package com.design.decorator;

/**
 * @author jerry
 * @create 17/9/28 13:05
 */
public class Ring extends WeaponDecorator {
    public Ring(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getDescription() {
        return hero.getDescription() + ",戒指";
    }

    @Override
    public int attack() {
        return hero.attack() + 2;
    }
}
