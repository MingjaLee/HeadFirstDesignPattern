package com.design.factory.factoryaf;

/**
 * @author jerry
 * @create 17/9/29 15:49
 */
public class HighMiAirFactory implements MiAirFactory {
    @Override
    public CPU createCPU() {
        return new HighMiAirCPU();
    }

    @Override
    public GPU createGPU() {
        return new HighMiAirGPU();
    }

    @Override
    public Computer createComputer() {
        Computer pc = new Computer();

        pc.setName("MiAir 15 High");
        pc.setGpu( createGPU() );
        pc.setCpu( createCPU() );

        return pc;
    }
}
