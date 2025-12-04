package org.self.learn.behavioral.behavior.strategy;

public class PasswordAuth implements AuthStratergy{
    @Override
    public boolean authenticate(String userId) {
        System.out.println("Authenticating through Password for UserId "+userId);
        return true;
    }
}
