package org.self.learn.behavioral.command;

public interface OrderCommand {
    void execute();
    String getName(); //For Logging
}
