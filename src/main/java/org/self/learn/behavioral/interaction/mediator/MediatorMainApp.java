package org.self.learn.behavioral.interaction.mediator;

public class MediatorMainApp {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();
        User u1 = new ChatUser(mediator,"Vickey");
        User u2 = new ChatUser(mediator,"Aditi");
        User u3 = new ChatUser(mediator,"Rahul");

        mediator.addUser(u1);
        mediator.addUser(u2);
        mediator.addUser(u3);
        u1.send("Heallo All");

    }
}
