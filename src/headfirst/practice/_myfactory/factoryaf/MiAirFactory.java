package com.design.factory.factoryaf;

/**
 * @author jerry
 * @create 17/9/29 15:18
 */
public  interface MiAirFactory {
    public CPU createCPU();
    public GPU createGPU();
    public Computer createComputer();
}
