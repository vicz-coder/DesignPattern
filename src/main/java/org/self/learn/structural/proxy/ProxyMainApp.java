package org.self.learn.structural.proxy;

public class ProxyMainApp {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("img.png");
        proxyImage.display();
        proxyImage.display();
    }
}
