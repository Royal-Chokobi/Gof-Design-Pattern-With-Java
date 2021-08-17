package com.design.pattern.abstractFactoryPattern.factory.win;

import com.design.pattern.abstractFactoryPattern.factory.GuiButton;
import com.design.pattern.abstractFactoryPattern.factory.GuiConsole;
import com.design.pattern.abstractFactoryPattern.factory.GuiFactory;

public class WinFactory implements GuiFactory {
    @Override
    public GuiButton button() {
        return new WinButton();
    }

    @Override
    public GuiConsole console() {
        return new WinConsole();
    }
}
