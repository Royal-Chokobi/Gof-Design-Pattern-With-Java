package com.design.pattern.abstractFactoryPattern.factory.mac;

import com.design.pattern.abstractFactoryPattern.factory.GuiButton;
import com.design.pattern.abstractFactoryPattern.factory.GuiFactory;
import com.design.pattern.abstractFactoryPattern.factory.GuiConsole;

public class MacFactory implements GuiFactory {
    @Override
    public GuiButton button() {
        return new MacButton();
    }

    @Override
    public GuiConsole console() {
        return new MacConsole();
    }
}
