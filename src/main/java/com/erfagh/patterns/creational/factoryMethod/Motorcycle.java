package com.erfagh.patterns.creational.factoryMethod;

public class Motorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
