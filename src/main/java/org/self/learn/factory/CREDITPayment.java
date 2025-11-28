package org.self.learn.factory;

public class CREDITPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Credit Payment Done");
    }
}
