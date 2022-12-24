package com.erfagh.patterns.behavioral.strategy;

public class MeatEater implements Eat{

    @Override
    public void eat() {
        System.out.println("MeatEater");
    }
}
