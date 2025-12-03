package org.self.learn.behavioral.interaction.mediator;

public class ChatUser extends User{

    ChatUser(ChatMediator chatMediator,String name){
        super(chatMediator,name);
    }

    @Override
    public void send(String msg) {
        System.out.println(name+" : Sending Message = "+msg);
        chatMediator.sendMessages(msg,this);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(name+" : Recieved Message = "+msg);
    }
}
