package org.self.learn.behavioral.request.chain;

public class Director extends Handler{
    @Override
    public void process(double amt) {
        if(amt<=50000){
            System.out.println("Approved By Director");
        }
        else{
            next.process(amt);
        }
    }
}
