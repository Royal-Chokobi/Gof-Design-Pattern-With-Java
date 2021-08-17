package com.design.pattern.abstractFactoryPattern.factory.win;

import com.design.pattern.abstractFactoryPattern.factory.GuiButton;

public class WinButton implements GuiButton {
    @Override
    public void clickButton() {
        System.out.println("Click Windows Button!");
    }
}
