package com.erfagh.patterns.creational.builder.order.orderBuilder;

public class ReOrder {
    public Order saveReOrder(Order order) {
        return new OrderBuilder(order)
                .setAddress(new DerivativelyAddress("iran", 202))
                .setStatus(Status.BUY)
                .build();
    }
}
