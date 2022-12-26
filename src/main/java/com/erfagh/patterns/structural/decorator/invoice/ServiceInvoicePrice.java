package com.erfagh.patterns.structural.decorator.invoice;

public class ServiceInvoicePrice extends InvoiceDecorator{
    public ServiceInvoicePrice(Invoice invoice) {
        super(invoice);
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice()+calculate();
    }

    private int calculate()
    {
        return 20000;
    }
}
