package org.self.learn.behavioral.request;

public abstract class Handler {

    Handler next;

    public Handler setNext(Handler handler){
        this.next = handler;
        return this.next;
    }

    public abstract void process(double amt);
}
