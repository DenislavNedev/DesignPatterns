package com.design.patterns.creational.factoryMethod;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
