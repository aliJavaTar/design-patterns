package com.erfagh.patterns.structural.decorator.ice;

public class ChocolateDecorator extends IceCreamDecorator {

    public ChocolateDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + addChocolate();
    }

    private String addChocolate() {
        return " add Chocolate ";
    }
}
