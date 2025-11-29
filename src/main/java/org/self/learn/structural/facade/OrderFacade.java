package org.self.learn.structural.facade;

public class OrderFacade {
    PaymentService paymentService;
    OrderService orderService;
    InventoryService inventoryService;
    EmailService emailService;

    OrderFacade(){
        this.paymentService = new PaymentService();
        this.orderService = new OrderService();
        this.inventoryService = new InventoryService();
        this.emailService = new EmailService();
    }

    public void placeOrder(long productId){
        if(inventoryService.isStock(productId)){
            paymentService.processPayment();
            orderService.createOrder();
            emailService.sendEmail("Order Accepted");
        }else {
            emailService.sendEmail("Order Out Of Stock");
        }

    }
}
