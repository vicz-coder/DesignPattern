package org.self.learn.behavioral.request.command;

public interface OrderCommand {
    void execute();
    String getName(); //For Logging
}
