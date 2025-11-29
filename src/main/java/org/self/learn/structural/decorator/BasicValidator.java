package org.self.learn.structural.decorator;

public class BasicValidator implements Validator{
    @Override
    public boolean validate(String input) {
        if(input==null||input.isEmpty()){
            return true;
        }
        return false;
    }
}
