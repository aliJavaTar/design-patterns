package com.erfagh.patterns.creational.builder.order.orderBuilder;

import com.erfagh.patterns.creational.builder.bad.order.OrderLine;

public class Order {
    private  Customer customer;
    private  DerivativelyAddress address;
    private  OrderLine orderLine;
    private  Status status;
    private  int totalPrice;
    private  int finalPrice;

    public Order(Customer customer, DerivativelyAddress address, OrderLine orderLine, Status status, int totalPrice, int finalPrice) {
        this.customer = customer;
        this.address = address;
        this.orderLine = orderLine;
        this.status = status;
        this.totalPrice = totalPrice;
        this.finalPrice = finalPrice;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAddress(DerivativelyAddress address) {
        this.address = address;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public DerivativelyAddress getAddress() {
        return address;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public Status getStatus() {
        return status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getFinalPrice() {
        return finalPrice;
    }
}
