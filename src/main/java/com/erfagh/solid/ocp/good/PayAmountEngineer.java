package com.erfagh.solid.ocp.good;

public class PayAmountEngineer implements PayAmount {
    private final int salary;

    public PayAmountEngineer(int salary) {
        this.salary=salary;
    }

    @Override
    public int calculatePayAmount(EmployeeType type) {
        return salary;
    }
}
