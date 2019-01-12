package com.design.factory.factorysf;

/**
 * @author jerry
 * @create 17/9/29 13:09
 */
/*
mac 配置
MBPR15:
	CPU: i7
	GPU: NVIDIA_1G
	Storage: 16G + 512G_SSD
MBPR 13:
	CPU: i5
	GPU: Intel_1G
	Storage: 8G + 256G_SSD

MI Air配置
MIAir13:
	CPU: i7
	GPU: NVIDIA GF940MX 1G
	Storage: 8G + 256G_SSD
MIAir15:
	CPU: i7
	GPU: NVIDIA GF150 2G
	Storage: 16G + 256G_SSD

*/
public class PCStoreDirver {
    public static void main(String[] args) {
        Computer pc;
        pc = SimpleFactoryPC.createComputer("MBPR13");
        System.out.println(pc);

        pc = SimpleFactoryPC.createComputer("MBPR15");
        System.out.println(pc);

        pc = SimpleFactoryPC.createComputer("MIAir13");
        System.out.println(pc);
    }
}
