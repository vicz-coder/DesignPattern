package org.self.learn.behavioral.behavior.strategy;

public class StrategyMainApp {
    public static void main(String[] args) {
        AuthStratergy otpAuth = new OTPAuth();
        AuthStratergy passAuth = new PasswordAuth();

        AuthContext authContext = new AuthContext();
        authContext.setStrategy(otpAuth);
        authContext.login("Vickey");

        authContext.setStrategy(passAuth);
        authContext.login("Aditi");
    }
}
