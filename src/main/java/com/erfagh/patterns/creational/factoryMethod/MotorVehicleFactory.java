package com.erfagh.patterns.creational.factoryMethod;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }


    protected abstract MotorVehicle createMotorVehicle();
}