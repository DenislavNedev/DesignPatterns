package com.design.patterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getSingleton();
        firstSingleton.showMessage();

        Singleton secondSingleton = Singleton.getSingleton();
        secondSingleton.showMessage();

        if (firstSingleton == secondSingleton) {
            System.out.println("firstSingleton and secondSingleton are the same object");
        }
    }
}
