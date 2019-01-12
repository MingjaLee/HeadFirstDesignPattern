package com.leej.designpattern.command.simpleremote;

/**
 * @author jerry
 * @create 2018/12/2 00:08
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
