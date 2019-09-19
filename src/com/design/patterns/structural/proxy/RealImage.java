package com.design.patterns.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFroDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFroDisk() {
        System.out.println("Loading " + fileName);
    }
}
