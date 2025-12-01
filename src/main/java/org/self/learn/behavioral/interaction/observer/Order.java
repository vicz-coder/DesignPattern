package org.self.learn.behavioral.interaction.observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject{

    private int orderId;
    private String status;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.updateStatus(this.orderId,status);
        }
    }

    public void updateStatus(String newStatus){
        this.status = newStatus;
        notifyObservers();
    }
}
