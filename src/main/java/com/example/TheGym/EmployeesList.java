package com.example.TheGym;

import java.util.ArrayList;
import java.util.List;

public class EmployeesList {
    public List<Employee> employees = new ArrayList<>();

    public EmployeesList() {
    }

    public EmployeesList(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
