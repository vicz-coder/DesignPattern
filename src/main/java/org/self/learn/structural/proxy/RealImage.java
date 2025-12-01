package org.self.learn.structural.proxy;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        //Load The File From Disk Heavy Operation
    }

    @Override
    public void display() {
        System.out.println("Displaying Image "+filename);
    }
}
