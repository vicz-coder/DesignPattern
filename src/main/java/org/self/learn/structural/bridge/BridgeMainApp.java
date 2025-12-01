package org.self.learn.structural.bridge;

public class BridgeMainApp {

    public static void main(String[] args) {
        UPIPayment upiPayment = new UPIPayment(new HDFCGateway());
        upiPayment.pay(5000);

        CreditPayment creditPayment = new CreditPayment(new SBIGateway());
        creditPayment.pay(6000);


    }
}
