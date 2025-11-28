package org.self.learn.abstractfactory;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new LightButtonTheme();
    }

    @Override
    public Background fillBackground() {
        return new LightBackgroundTheme();
    }
}
