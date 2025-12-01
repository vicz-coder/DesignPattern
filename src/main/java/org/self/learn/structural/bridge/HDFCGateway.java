package org.self.learn.structural.bridge;

public class HDFCGateway implements PaymentGateway{
    @Override
    public void processPayment(double amt) {
        System.out.println("Processing Payment Through HDFC Of Amount : "+amt);
    }
}
