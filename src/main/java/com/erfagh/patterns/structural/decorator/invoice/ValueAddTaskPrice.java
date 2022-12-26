package com.erfagh.patterns.structural.decorator.invoice;

public class ValueAddTaskPrice extends InvoiceDecorator {

    public ValueAddTaskPrice(Invoice invoice) {
        super(invoice);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice()+calculate();
    }

    private int calculate() {
        return 3000;
    }
}
