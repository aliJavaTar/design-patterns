package com.erfagh.solid.ocp.bad;

public class Employee {

    private final int salary;
    private final int bonus;
    private final EmployeeType type;

    Employee(int salary, int bonus, EmployeeType type) {
        this.salary = salary;
        this.bonus = bonus;
        this.type = type;
    }

    public int payAmount() {
        return switch (this.type) {
            case ENGINEER -> salary;
            case MANAGER -> salary + bonus;
            default -> 0;
        };
    }

}