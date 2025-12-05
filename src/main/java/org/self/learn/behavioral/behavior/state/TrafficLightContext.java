package org.self.learn.behavioral.behavior.state;

public class TrafficLightContext
{
    TrafficLightState state;

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public TrafficLightContext() {
        this.state = new RedState();
    }

    public void switchLight(){
        state.switchLight(this);
    }

    public void showSignal(){
        state.showSignal();
    }
}
