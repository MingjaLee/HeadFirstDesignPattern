package com.leej.designpattern.command.simpleremote;

/**
 * @author jerry
 * @create 2018/12/2 00:07
 */
public class Light {
    public Light() {
    }

    public void on() {
        System.out.println("Light is on.");
    }

    public void off() {
        System.out.println("Light is off.");
    }
}
