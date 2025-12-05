package org.self.learn.behavioral.behavior.state;

public class GreenState implements TrafficLightState{
    @Override
    public void switchLight(TrafficLightContext trafContext) {
        trafContext.setState(new YellowState());
    }

    @Override
    public void showSignal() {
        System.out.println("GREEN - GO!!!!");
    }
}
