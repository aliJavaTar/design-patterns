package com.erfagh.patterns.structural.decorator.ice;

public class App {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateDecorator(new HoneyDecorator(new SimpleIceCream()));
        System.out.println(iceCream.makeIceCream());
    }
}
