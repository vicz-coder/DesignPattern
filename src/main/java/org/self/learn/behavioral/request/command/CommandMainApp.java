package org.self.learn.behavioral.request.command;

public class CommandMainApp {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderProcessor orderProcessor = new OrderProcessor();

        OrderCommand place1 = new PlaceOrderCommand(orderService,1);
        OrderCommand place2 = new PlaceOrderCommand(orderService,2);
        OrderCommand cancel1 = new CancelOrderCommand(orderService,1);

        //Execute Command
        orderProcessor.process(place1);
        orderProcessor.process(place2);
        orderProcessor.process(cancel1);

        System.out.println("Logs : "+orderProcessor.getLogs());
    }



}
