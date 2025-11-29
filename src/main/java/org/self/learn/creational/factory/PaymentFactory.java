package org.self.learn.creational.factory;

public class PaymentFactory {
    public static Payment getPayment(PaymentType type){
        Payment payment = null;
        if(type==PaymentType.UPI){
            return new UPIPayment();
        } else if (type==PaymentType.CREDIT) {
            return new CREDITPayment();
        }
        return payment;

    }
}
