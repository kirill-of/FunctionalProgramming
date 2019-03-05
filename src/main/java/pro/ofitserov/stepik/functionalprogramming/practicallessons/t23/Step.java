package pro.ofitserov.stepik.functionalprogramming.practicallessons.t23;

import pro.ofitserov.stepik.functionalprogramming.practicallessons.Utils;

import java.util.List;

/**
 * 2.23 The ﻿general number of employees
 * You have two classes: Employee (name: String, salary: Long) and Department (name: String, code: String, employees: List<Employee>). Both classes have getters for all fields with the corresponding names (getName(), getSalary(), getEmployees() and so on).
 * <p>
 * Write a method using Stream API that calculates the general number of employees with salary >= threshold for all departments whose code starts with string "111-" (without ""). Perhaps, flatMap method can help you to implement it.
 * <p>
 * Classes Employee and Department will be available during testing. You can define your own classes for local testing.
 * <p>
 * Important. Use the given template for your method. Pay attention to type of an argument and the returned value. Please, use only Stream API, no cycles.
 * <p>
 * Examples: there are 2 departments (in JSON notation) below and ﻿threshold = 20 000. The result is 1 (because there is only one suitable employee).
 */

public class Step {

    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold   is lower edge of salary
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(department -> department.code.startsWith("111-"))
                .flatMap(department -> department.employees.stream())
                .filter(employee -> employee.salary >= threshold)
                .count();
    }

    public static void main(String[] args) throws Exception {
        List<Department> departments = Utils.getListFromJSON(new Department(), "src\\main\\java\\pro\\ofitserov\\stepik\\functionalprogramming\\practicallessons\\t23\\examples.json", Department.class);

        System.out.println(departments);

        System.out.println(calcNumberOfEmployees(departments, 20_000));
    }
}