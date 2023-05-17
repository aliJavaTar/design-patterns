package com.erfagh.solid.ocp.good;

import java.util.LinkedHashMap;
import java.util.Map;

public class CalculateSalary {
    private final int salary;
    private final int bonus;

    private final Map<EmployeeType, PayAmount> pay = new LinkedHashMap<>();


    public CalculateSalary(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
        pay.put(EmployeeType.ENGINEER, new PayAmountEngineer(salary));
        pay.put(EmployeeType.MANAGER, new PayAmountManager(salary, bonus));
    }

    public PayAmount getMoney(EmployeeType type) {
        return pay.get(type);
    }

}
