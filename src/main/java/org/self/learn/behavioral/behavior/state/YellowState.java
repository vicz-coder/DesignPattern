package org.self.learn.behavioral.behavior.state;

public class YellowState implements TrafficLightState{
    @Override
    public void switchLight(TrafficLightContext trafContext) {
        trafContext.setState(new RedState());
    }

    @Override
    public void showSignal() {
        System.out.println("YELLOW - Slow Down Vehicle.");
    }
}
