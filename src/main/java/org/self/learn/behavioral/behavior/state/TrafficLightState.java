package org.self.learn.behavioral.behavior.state;

public interface TrafficLightState {
    public void switchLight(TrafficLightContext trafContext);
    public void showSignal();
}
