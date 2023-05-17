package com.erfagh.solid.ocp.good;

public class Employee {


    private final CalculateSalary salary;

    public Employee(CalculateSalary context) {
        this.salary = context;
    }

    public int payAmount(EmployeeType employeeType) {
        return salary.getMoney(employeeType).calculatePayAmount(employeeType);
    }

}