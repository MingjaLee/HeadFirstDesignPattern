package com.design.factory.factoryaf;

/**
 * @author jerry
 * @create 17/9/29 13:46
 */
public class PCStoreDriver {
    public static void main(String[] args) {
        Computer pc = null;
        MiAirFactory meduimFactory = new MeduimMiAirFactory();
        MiAirFactory highFactory = new HighMiAirFactory();

        pc = meduimFactory.createComputer();
        System.out.println(pc);

        pc = highFactory.createComputer();
        System.out.println(pc);
    }
}
