package org.self.learn.structural.decorator;

public class EmailDecorator extends ValidatorDecorator{

    EmailDecorator(Validator validator){
        super(validator);
    }

    @Override
    public boolean validate(String input) {
       if(!validator.validate(input)) return true;
       return input.contains("@") && input.contains(".");
    }
}
