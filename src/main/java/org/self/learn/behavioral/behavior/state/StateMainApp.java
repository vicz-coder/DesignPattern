package org.self.learn.behavioral.behavior.state;

public class StateMainApp {
    public static void main(String[] args) throws Exception{
        TrafficLightContext lightContext = new TrafficLightContext();
        for (int i =0 ; i<6;i++){
            lightContext.showSignal();
            lightContext.switchLight();
            Thread.sleep(2000);
        }
    }
}
