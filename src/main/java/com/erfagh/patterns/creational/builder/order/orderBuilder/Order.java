package com.erfagh.patterns.creational.builder.order.orderBuilder;

import com.erfagh.patterns.creational.builder.bad.order.OrderLine;

public record Order(Customer customer, DerivativelyAddress address, OrderLine orderLine,
                    Status status, int totalPrice, int finalPrice) {
}
