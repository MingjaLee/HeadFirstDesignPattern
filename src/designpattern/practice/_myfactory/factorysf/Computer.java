package com.design.factory.factorysf;

/**
 * @author jerry
 * @create 17/9/29 13:11
 */
public abstract class Computer {
    String name;
    String CPU;
    String GPU;
    String Storage;

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---" + name + "---\n");
        display.append("CPU:" + CPU + "\t");
        display.append("GPU:" + GPU + "\t");
        display.append("Storage:" + Storage + "\n");
        return display.toString();
    }
}
