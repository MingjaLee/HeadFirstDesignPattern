package com.design.factory.factorysf;

/**
 * @author jerry
 * @create 17/9/29 13:24
 */
public class SimpleFactoryPC {
    //可用反射机制创建对象
    public static Computer createComputer(String type) {
        Computer pc = null;
        if ( type.equalsIgnoreCase("MBPR13") ) {
            pc = new MBPR13();
        }
        else if ( type.equalsIgnoreCase("MBPR15") ) {
            pc = new MBPR15();
        }
        else if ( type.equalsIgnoreCase("MIAir13") ) {
            pc = new MIAir13();
        }
        else if ( type.equalsIgnoreCase("MIAir15") ) {
            pc = new MIAir15();
        }

        return pc;
    }
}
