package org.self.learn.structural.bridge;

public class SBIGateway implements PaymentGateway{
    @Override
    public void processPayment(double amt) {
        System.out.println("Processing Payment Through SBI Of Amount : "+amt);
    }
}
