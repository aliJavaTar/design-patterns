package com.erfagh.patterns.creational.builder.order.orderBuilder;

public enum Status {
    CANCEL(1), BUY(2);

    private final int type;

    Status(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
