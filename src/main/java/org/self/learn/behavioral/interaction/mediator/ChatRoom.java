package org.self.learn.behavioral.interaction.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessages(String msg,User user) {
        users.stream()
                .filter(u-> u!=user)
                .forEach(u-> u.recieve(msg));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
