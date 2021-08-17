package com.design.pattern.abstractFactoryPattern.factory;

public interface GuiFactory {
    GuiButton button();
    GuiConsole console();
}
