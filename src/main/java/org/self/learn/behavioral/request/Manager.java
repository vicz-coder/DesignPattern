package org.self.learn.behavioral.request;

public class Manager extends Handler{
    @Override
    public void process(double amt) {
        if(amt<=10000){
            System.out.println("Approved By Manager");
        }
        else{
            next.process(amt);
        }
    }
}
