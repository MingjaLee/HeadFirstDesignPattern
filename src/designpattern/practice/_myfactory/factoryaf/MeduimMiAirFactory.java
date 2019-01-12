package com.design.factory.factoryaf;

/**
 * @author jerry
 * @create 17/9/29 15:20
 */
public class MeduimMiAirFactory implements MiAirFactory {
    @Override
    public CPU createCPU() {
        return new MediumMiAirCPU();
    }

    @Override
    public GPU createGPU() {
        return new MediumMiAirGPU();
    }

    @Override
    public Computer createComputer() {
        Computer pc = new Computer();
        pc.setName("MiAir 13 Medium");
        pc.setCpu( createCPU() );
        pc.setGpu( createGPU() );

        return pc;
    }
}
