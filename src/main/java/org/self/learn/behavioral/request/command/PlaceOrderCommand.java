package org.self.learn.behavioral.request.command;

public class PlaceOrderCommand implements OrderCommand{
    private OrderService orderService;
    private int orderId;

    public PlaceOrderCommand(OrderService orderService, int orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderService.placeOrder(orderId);
    }

    @Override
    public String getName() {
        return "PlaceOrder: "+orderId;
    }
}
