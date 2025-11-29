package org.self.learn.structural.decorator;

public class LengthDecorator extends ValidatorDecorator{

    int length;

    LengthDecorator(Validator validator,int length){
        super(validator);
        this.length=length;
    }

    @Override
    public boolean validate(String input) {
        if(!validator.validate(input)) return false;
        return input.length()<=length;
    }
}
