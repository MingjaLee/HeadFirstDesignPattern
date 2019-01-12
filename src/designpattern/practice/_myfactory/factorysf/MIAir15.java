package com.design.factory.factorysf;

/**
 * @author jerry
 * @create 17/9/29 13:22
 */
/*
MIAir15:
	CPU: i7
	GPU: NVIDIA GF150 2G
	Storage: 16G + 256G_SSD
 */
public class MIAir15 extends Computer {
    public MIAir15() {
        this.name = "MIAir 15";
        this.CPU = "i7";
        this.GPU = "NVIDIA GF150 2G";
        this.Storage = "16G + 256G_SSD";
    }
}
