package com.design.decorator;

/**
 * @author jerry
 * @create 17/9/28 12:47
 */
public abstract class Hero {
    public String description = "Unknow Description";

    public String getDescription() {
        return description;
    }

    public abstract int attack();
}
