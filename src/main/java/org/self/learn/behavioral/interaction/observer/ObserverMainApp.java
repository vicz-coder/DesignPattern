package org.self.learn.behavioral.interaction.observer;

public class ObserverMainApp {
    public static void main(String[] args) {
        Order order = new Order(123);

        //Customer
        Customer customer = new Customer();
        //Seller
        Seller seller = new Seller();
        //Register
        order.register(customer);
        order.register(seller);
        //Update New Status And Notify
        order.updateStatus("SHIPPED");
    }
}
