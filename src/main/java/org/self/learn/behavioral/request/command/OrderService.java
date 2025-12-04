package org.self.learn.behavioral.request.command;

public class OrderService {
    public void placeOrder( int orderId){
        System.out.println("Order Placed: "+orderId);
    }

    public void cancelOrder(int orderId){
        System.out.println("Order Cancelled: "+orderId);
    }
}
