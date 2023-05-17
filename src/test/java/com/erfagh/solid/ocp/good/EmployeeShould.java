package com.erfagh.solid.ocp.good;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeShould {
    private static final int BONUS = 100;
    private static final int SALARY = 1000;

    @Test
    void not_add_bonus_to_the_engineer_pay_amount() {
        Employee employee = new Employee(new CalculateSalary(SALARY, BONUS));
        int price = employee.payAmount(EmployeeType.ENGINEER);
        Assertions.assertThat(price).isEqualTo(SALARY);

    }


    @Test
    void add_bonus_to_the_manager_pay_amount() {

        CalculateSalary calculateSalary = new CalculateSalary(SALARY, BONUS);

        Employee employee = new Employee(calculateSalary);

        int price = employee.payAmount(EmployeeType.MANAGER);

        int expectedEmployeePrice = SALARY + BONUS;

        Assertions.assertThat(price).isEqualTo(expectedEmployeePrice);
    }

}