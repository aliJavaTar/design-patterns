package com.erfagh.patterns.creational.builder.bad.order;

public class Order {

    private String customer;
    private long totalPrice;
    private long finalPrice;
    private String deliveryAddress;
    private String orderLInes;
    private byte status;

    public Order(String customer, long totalPrice,
                 long finalPrice, String deliveryAddress,
                 String orderLInes, byte status) {
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.finalPrice = finalPrice;
        this.deliveryAddress = deliveryAddress;
        this.orderLInes = orderLInes;
        this.status = status;
    }

    public String getCustomer() {
        return customer;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public long getFinalPrice() {
        return finalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getOrderLInes() {
        return orderLInes;
    }

    public byte getStatus() {
        return status;
    }
}
