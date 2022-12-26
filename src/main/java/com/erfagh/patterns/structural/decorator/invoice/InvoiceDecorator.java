package com.erfagh.patterns.structural.decorator.invoice;

public class InvoiceDecorator implements Invoice{

    private final Invoice invoice;

    public InvoiceDecorator(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public int calculatePrice() {
        return invoice.calculatePrice();
    }
}
