package com.design.patterns.creational.builder;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 35.0f;
    }
}
