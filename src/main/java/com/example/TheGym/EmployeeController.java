package com.example.TheGym;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gym")
public class EmployeeController {

    private Employees employees = new Employees();

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployee(@RequestParam(value = "searchString", defaultValue = "") String searchString) {
        return employees.getEmployees(searchString);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee postEmployee(@RequestBody Employee employee) {
        employees.addEmployee(employee);
        return employee;
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") String employeeId) {

        Employee employee = employees.getEmployeeById(employeeId);
        return employee;
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public Employee deleteEmployee(@PathVariable("id") String employeeId) {

        return employees.deleteEmployee(employeeId);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    public Employee putEmployee(@PathVariable("id") String employeeId, @RequestBody Employee employee) {

        employees.replaceEmployeeWithId(employeeId, employee);
        return employee;
    }
}
