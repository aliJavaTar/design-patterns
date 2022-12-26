package com.erfagh.patterns.structural.decorator.invoice;

public class InvoicePrice implements Invoice {
    @Override
    public int calculatePrice() {
        return 100;
    }
}
