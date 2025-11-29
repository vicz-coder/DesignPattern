package org.self.learn.creational.abstractfactory;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new DarkButtonTheme();
    }

    @Override
    public Background fillBackground() {
        return new DarkBackgroundTheme();
    }
}
