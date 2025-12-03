package org.self.learn.behavioral.interaction.mediator;

public abstract class User {

    ChatMediator chatMediator;
    String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void recieve(String msg);
}
