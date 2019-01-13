package com.design.factory.factoryfm;

/**
 * @author jerry
 * @create 17/9/29 13:39
 */
public class MIFactoryPC extends Factory {
    @Override
    Computer createComputer(String type) {
        Computer pc = null;
        if ( type.equalsIgnoreCase("Medium") ) {
            pc = new MIAir13();
        }
        else if ( type.equalsIgnoreCase("High") ) {
            pc = new MIAir15();
        }
        return pc;
    }
}
