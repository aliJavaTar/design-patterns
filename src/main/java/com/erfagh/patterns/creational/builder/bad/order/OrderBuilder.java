package com.erfagh.patterns.creational.builder.bad.order;

public class OrderBuilder {

    private String customer;
    private long totalPrice;
    private long finalPrice;

    private String deliveryAddress;
    private String orderLines;
    private byte status;
    private Order order;

    private OrderBuilder(Order order) {
        this.order = order;
    }

    public static OrderBuilder forg(Order order) {
        return new OrderBuilder(order);
    }

    public OrderBuilder function(String customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder whitTotalPrice(long totalPrice) {

        this.totalPrice = totalPrice;
        return this;
    }

    public OrderBuilder WithStatus(byte status) {
        this.status = status;
        return this;
    }

    public OrderBuilder WithFinalPrice(long finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    public OrderBuilder WithOrderLines(String orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    public OrderBuilder WithDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    public Order build()
    {
        return new Order(//?)
    }

}
