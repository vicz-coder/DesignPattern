package org.self.learn.structural.adapter;

public class PaymentAdapter implements Payment{

    ThirdPartyPaymentGateway thirdPartyPaymentGateway;

    public PaymentAdapter(ThirdPartyPaymentGateway thirdPartyPaymentGateway) {
        this.thirdPartyPaymentGateway = thirdPartyPaymentGateway;
    }

    @Override
    public void process(double amt) {
        thirdPartyPaymentGateway.executePayment(amt);
    }
}
