package org.self.learn.behavioral.interaction.observer;

public class Customer implements Observer{
    @Override
    public void updateStatus(int orderId, String status) {
        System.out.println("Client App Status Update for Order Id "+orderId+" :: "+status);
    }
}
