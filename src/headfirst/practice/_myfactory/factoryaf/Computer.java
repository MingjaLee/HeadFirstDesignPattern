package com.design.factory.factoryaf;

/**
 * @author jerry
 * @create 17/9/29 15:05
 */
public class Computer {
    String name;
    CPU cpu;
    GPU gpu;

    public void setName(String name) {
        this.name = name;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---" + this.name + "---\n");
        display.append("CPU: " + cpu + "\t");
        display.append("GPU: " + gpu + "\t");

        return display.toString();
    }
}
