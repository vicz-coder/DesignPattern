package org.self.learn.structural.decorator;

public class DecoratorMainApp {
    public static void main(String[] args) {
        String input = "test@gmail.com";
        Validator validator = new BasicValidator();
        EmailDecorator emailDecorator = new EmailDecorator(validator);
        System.out.println("Email Validation "+emailDecorator.validate(input));
        LengthDecorator lengthDecorator = new LengthDecorator(validator,8);
        System.out.println("Length Validation :"+lengthDecorator.validate(input));
    }
}
