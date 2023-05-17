package com.erfagh.solid.ocp.good;

public class PayAmountManager implements PayAmount {
    private final int salary;
    private final int bonus;

    public PayAmountManager(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int calculatePayAmount(EmployeeType type) {
        return salary+bonus;
    }
}
