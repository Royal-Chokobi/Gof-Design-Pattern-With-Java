package com.design.pattern.abstractFactoryPattern.concrete;

import com.design.pattern.abstractFactoryPattern.factory.GuiFactory;
import com.design.pattern.abstractFactoryPattern.factory.mac.MacFactory;
import com.design.pattern.abstractFactoryPattern.factory.win.WinFactory;

public class ConcreteFactory {
    public static GuiFactory getInstance(){
        String property = System.getProperty("os.name");
        System.out.println("property = " + property);
        if (property.equals("Mac OS X")){
            return new MacFactory();
        }else {
            return new WinFactory();
        }
    }
}
