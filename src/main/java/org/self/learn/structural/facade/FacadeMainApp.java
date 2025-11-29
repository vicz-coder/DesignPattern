package org.self.learn.structural.facade;

public class FacadeMainApp {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder(10);
    }
}
