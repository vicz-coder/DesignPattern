package org.self.learn.behavioral.behavior.state;

public class RedState implements TrafficLightState{
    @Override
    public void switchLight(TrafficLightContext trafContext) {
        trafContext.setState(new GreenState());
    }

    @Override
    public void showSignal() {
        System.out.println("RED - Stop The Vehicle");
    }
}
