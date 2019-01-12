package com.design.factory.factoryfm;

/**
 * @author jerry
 * @create 17/9/29 13:41
 */
public class MBPRFactoryPC extends Factory {
    @Override
    Computer createComputer(String type) {
        Computer pc = null;
        if ( type.equalsIgnoreCase("Medium") ) {
            pc = new MBPR13();
        }
        else if ( type.equalsIgnoreCase("High") ) {
            pc = new MBPR15();
        }
        return pc;
    }
}
