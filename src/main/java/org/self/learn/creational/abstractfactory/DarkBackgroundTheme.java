package org.self.learn.creational.abstractfactory;

public class DarkBackgroundTheme implements Background{
    @Override
    public void fill() {
        System.out.println("Dark Theme Background Added");
    }
}
