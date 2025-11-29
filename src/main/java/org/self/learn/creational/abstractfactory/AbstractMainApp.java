package org.self.learn.creational.abstractfactory;

public class AbstractMainApp {
    public static void main(String[] args) {
        boolean isDarkTheme = true;
        ThemeFactory themeFactory;
        if(!isDarkTheme){
            themeFactory = new LightThemeFactory();
        }else {
            themeFactory = new DarkThemeFactory();
        }

        Button btn = themeFactory.createButton();
        Background bg = themeFactory.fillBackground();

        btn.render();
        bg.fill();
    }
}
