package org.self.learn.abstractfactory;

public class LightBackgroundTheme implements Background{
    @Override
    public void fill() {
        System.out.println("Light Theme Background Added");
    }
}
