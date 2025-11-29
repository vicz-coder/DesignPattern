package org.self.learn.structural.decorator;

public abstract class ValidatorDecorator implements Validator{
    Validator validator;
    public ValidatorDecorator(Validator validator) {
        this.validator = validator;
    }
}
