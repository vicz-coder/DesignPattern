package org.self.learn.structural.bridge;

public class UPIPayment extends Payment{

    private PaymentGateway gateway;

    public UPIPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
        this.gateway = paymentGateway;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Using UPI Mode ::");
        this.gateway.processPayment(amt);
    }
}
