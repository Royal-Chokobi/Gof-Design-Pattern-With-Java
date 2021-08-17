package com.design.pattern.abstractFactoryPattern.factory.mac;

import com.design.pattern.abstractFactoryPattern.factory.GuiButton;

public class MacButton implements GuiButton {
    @Override
    public void clickButton() {
        System.out.println("Click Mac Button!");
    }
}
