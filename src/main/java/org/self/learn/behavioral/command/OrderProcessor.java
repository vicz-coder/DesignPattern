package org.self.learn.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

    private List<String> logs = new ArrayList<>();

    public void process(OrderCommand orderCommand){
        orderCommand.execute();
        logs.add(orderCommand.getName());
    }

    public List<String> getLogs(){
        return this.logs;
    }
}
