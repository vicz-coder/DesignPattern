package org.self.learn.structural.adapter;

public class ThirdPartyPaymentGateway {
    public void executePayment(double value){
        System.out.println("Third Party Payment Done for Amount "+value);
    }
}
