package org.self.learn.behavioral.request.command;

public class CancelOrderCommand implements OrderCommand{
    private OrderService orderService;
    private int orderId;

    public CancelOrderCommand(OrderService orderService, int orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderService.cancelOrder(orderId);
    }

    @Override
    public String getName() {
        return "CancelOrder: "+orderId;
    }
}
