package com.erfagh.patterns.structural.decorator.ice;

public class HoneyDecorator extends IceCreamDecorator {
    public HoneyDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + addHoney();
    }

    private String addHoney() {
        return " add honey ";
    }
}
