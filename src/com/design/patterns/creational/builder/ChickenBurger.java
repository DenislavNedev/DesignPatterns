package com.design.patterns.creational.builder;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken burger";
    }

    @Override
    public float getPrice() {
        return 50.5f;
    }
}
