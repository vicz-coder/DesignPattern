package org.self.learn.structural.adapter;

public class MainApp {
    public static void main(String[] args) {
        ThirdPartyPaymentGateway thirdPartyPaymentGateway = new ThirdPartyPaymentGateway();
        Payment p = new PaymentAdapter(thirdPartyPaymentGateway);
        p.process(40.0);
    }
}
