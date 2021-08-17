package com.design.pattern.abstractFactoryPattern.factory.mac;

import com.design.pattern.abstractFactoryPattern.factory.GuiConsole;

public class MacConsole implements GuiConsole {
    @Override
    public void getConsole() {
        System.out.println("Mac Console!");
    }
}
