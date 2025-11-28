package org.self.learn.factory;

public class FactoryMainApp {
    public static void main(String[] args) {
        Payment p = PaymentFactory.getPayment(PaymentType.CREDIT);
        p.pay();
    }
}
