package com.erfagh.patterns.behavioral.strategy;

public class Vegetarianism implements Eat{
    @Override
    public void eat() {
        System.out.println("Vegetarianism");
    }
}
