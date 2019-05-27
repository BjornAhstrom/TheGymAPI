package com.example.TheGym;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Employees {

    EmployeesList employees = new EmployeesList();
    ObjectMapper mapper = new ObjectMapper();

    public Employees() {
        this.employees.employees = new ArrayList<>();
//        addMockData();
        readFromFile();
    }

    public List<Employee> getEmployees(String searchString) {
        if (searchString.equals(""))
            return employees.employees;

        ArrayList<Employee> employees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getUserName().toLowerCase().contains(searchString.toLowerCase()))
                employees.add(employee);
        }
        return  employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.employees.add(employee);
        writeToFile();
    }

    public Employee getEmployeeById(String id) {

        return findEmployeeById(id);
    }

    public Employee deleteEmployee(String employeeId) {
        Employee employee = findEmployeeById(employeeId);
        employees.employees.remove(employee);
        writeToFile();
        return employee;
    }

    public void replaceEmployeeWithId(String employeeId, Employee newEmployee) {

        Employee oldEmployee = findEmployeeById(employeeId);
        employees.employees.remove(oldEmployee);
        newEmployee.setId(oldEmployee.getId());
        employees.employees.add(newEmployee);
        writeToFile();
    }

    private Employee findEmployeeById(String id) {
        for (Employee employee : employees.employees) {
            if (employee.getId().equals(id))
                return employee;
        }
        return null;
    }

    private void writeToFile() {
        try {
            mapper.writeValue(new File("employees.json"), employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            String resourceEmployees = "employees.json";
            InputStream fileStream = new FileInputStream(resourceEmployees);
            EmployeesList employeesList = mapper.readValue(fileStream, EmployeesList.class);

            employees = employeesList;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
