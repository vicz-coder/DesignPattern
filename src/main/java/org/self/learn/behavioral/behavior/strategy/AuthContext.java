package org.self.learn.behavioral.behavior.strategy;

public class AuthContext {

    private AuthStratergy strategy;

    public AuthStratergy getStrategy() {
        return strategy;
    }

    public void setStrategy(AuthStratergy strategy) {
        this.strategy = strategy;
    }

    public void login(String userId){
        boolean isAuthenticate =  strategy.authenticate(userId);
        if (isAuthenticate){
            System.out.println("Successfull Login");
        }else {
            System.out.println("Invalid UserId");
        }
    }
}
