package org.self.learn.behavioral.behavior.strategy;

public class OTPAuth implements AuthStratergy{
    @Override
    public boolean authenticate(String userId) {
        System.out.println("Authenticating through OTP for UserId "+userId);
        return true;
    }
}
