package com.design.patterns.creational.builder;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 30.0f;
    }
}
