package com.erfagh.patterns.creational.builder.order.orderBuilder;

import com.erfagh.patterns.creational.builder.bad.order.OrderLine;

public class Order {
    private Customer customer;

    private DerivativelyAddress address;
    private OrderLine orderLine;
    private Status status;
    private int totalPrice;

    private int finalPrice;

}
