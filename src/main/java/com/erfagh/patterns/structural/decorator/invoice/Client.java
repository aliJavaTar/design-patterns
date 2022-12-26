package com.erfagh.patterns.structural.decorator.invoice;

public class Client {
    public static void main(String[] args) {
        Invoice invoice = new InvoicePrice();
        System.out.println(invoice.calculatePrice());

        invoice=new ServiceInvoicePrice(new InvoicePrice());
        System.out.println(invoice.calculatePrice());

        invoice=new ValueAddTaskPrice(new ServiceInvoicePrice(new InvoicePrice()));
        System.out.println(invoice.calculatePrice());
    }


}
