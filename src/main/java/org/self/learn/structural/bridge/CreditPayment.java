package org.self.learn.structural.bridge;

public class CreditPayment extends Payment{

    private PaymentGateway gateway;

    public CreditPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
        this.gateway = paymentGateway;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Using Credit Mode ::");
        this.gateway.processPayment(amt);
    }
}
