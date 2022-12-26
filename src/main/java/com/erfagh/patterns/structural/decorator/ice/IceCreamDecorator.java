package com.erfagh.patterns.structural.decorator.ice;

public class IceCreamDecorator implements IceCream {
    protected final IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String makeIceCream() {
        return iceCream.makeIceCream();
    }
}
