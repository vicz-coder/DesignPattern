package org.self.learn.behavioral.request.chain;

public class CEO extends Handler{
    @Override
    public void process(double amt) {
        if(amt>50000){
            System.out.println("Approved By CEO");
        }
        else{
            next.process(amt);
        }
    }
}
