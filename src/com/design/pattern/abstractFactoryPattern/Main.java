package com.design.pattern.abstractFactoryPattern;

import com.design.pattern.abstractFactoryPattern.concrete.ConcreteFactory;
import com.design.pattern.abstractFactoryPattern.factory.GuiButton;
import com.design.pattern.abstractFactoryPattern.factory.GuiConsole;
import com.design.pattern.abstractFactoryPattern.factory.GuiFactory;

public class Main {
    public static void main(String[] args) {
        GuiFactory guiFactory = ConcreteFactory.getInstance();
        GuiButton button = guiFactory.button();
        GuiConsole console = guiFactory.console();

        button.clickButton();
        console.getConsole();

    }
}
