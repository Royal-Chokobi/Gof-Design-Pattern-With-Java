package com.design.pattern.abstractFactoryPattern.factory.win;

import com.design.pattern.abstractFactoryPattern.factory.GuiConsole;

public class WinConsole implements GuiConsole {
    @Override
    public void getConsole() {
        System.out.println("Windows Console!");
    }
}
