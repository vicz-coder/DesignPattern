package org.self.learn.behavioral.request.chain;

public class ChainMAinApp {
    public static void main(String[] args) {
        Handler manager = new Manager();
        Handler director = new Director();
        Handler ceo = new CEO();

        //Builder The Chain
        manager.setNext(director).setNext(ceo);

        manager.process(9000);
        manager.process(20000);
        manager.process(90000);

    }
}
