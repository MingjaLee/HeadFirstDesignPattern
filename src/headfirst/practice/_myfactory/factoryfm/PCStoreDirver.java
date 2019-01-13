package com.design.factory.factoryfm;

/**
 * @author jerry
 * @create 17/9/29 13:33
 */
public class PCStoreDirver {
    public static void main(String[] args) {
        Factory MIFactory = new MIFactoryPC();
        Factory MBPRFactory = new MBPRFactoryPC();
        Computer pc = null;

        pc = MIFactory.createComputer("medium");
        System.out.println(pc);
        pc = MBPRFactory.createComputer("medium");
        System.out.println(pc);

        pc = MIFactory.createComputer("high");
        System.out.println(pc);
    }
}
