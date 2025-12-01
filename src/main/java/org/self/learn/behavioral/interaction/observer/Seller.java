package org.self.learn.behavioral.interaction.observer;

public class Seller implements Observer{
    @Override
    public void updateStatus(int orderId, String status) {
        System.out.println("Seller App Status Update for Order Id "+orderId+" :: "+status);
    }
}
