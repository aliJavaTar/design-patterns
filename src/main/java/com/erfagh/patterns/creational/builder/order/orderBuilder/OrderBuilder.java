package com.erfagh.patterns.creational.builder.order.orderBuilder;

import com.erfagh.patterns.creational.builder.bad.order.OrderLine;

public class OrderBuilder {
    private Customer customer;

    private DerivativelyAddress address;
    private OrderLine orderLine;
    private Status status;
    private int totalPrice;

    private int finalPrice;

    private Order order;

    public OrderBuilder(Order order) {
        this.order = order;
    }

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder setAddress(DerivativelyAddress address) {
        this.address = address;
        return this;
    }

    public OrderBuilder setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
        return this;
    }

    public OrderBuilder setStatus(Status status) {
        this.status = status;
        return this;
    }

    public OrderBuilder setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderBuilder setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }
}
