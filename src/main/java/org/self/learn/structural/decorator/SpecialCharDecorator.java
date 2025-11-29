package org.self.learn.structural.decorator;

public class SpecialCharDecorator extends ValidatorDecorator{

    SpecialCharDecorator(Validator validator){
        super(validator);
    }

    @Override
    public boolean validate(String input) {
        if(!validator.validate(input)) return false;
        return input.matches("[A-Za-z0-9@.]+");
    }
}
