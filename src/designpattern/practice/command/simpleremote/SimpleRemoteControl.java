package com.leej.designpattern.command.simpleremote;

/**
 * @author jerry
 * @create 2018/12/2 00:10
 */

//Invoker
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
