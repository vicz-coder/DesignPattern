package org.self.learn.behavioral.interaction.mediator;

public interface ChatMediator {
    public void sendMessages(String msg,User user);
    public void addUser(User user);

}
