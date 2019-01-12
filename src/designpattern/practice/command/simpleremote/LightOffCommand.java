package com.leej.designpattern.command.simpleremote;

/**
 * @author jerry
 * @create 2018/12/2 00:22
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
