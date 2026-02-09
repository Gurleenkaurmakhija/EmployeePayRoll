package com.gevernova.employeepayroll.controller;

import com.gevernova.employeepayroll.entity.EmployeePayrollData;
import com.gevernova.employeepayroll.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService service;

    // get all employees
    @GetMapping("/")
    public List<EmployeePayrollData> getAll() {
        return service.getAllEmployees();
    }

    // get employee by id
    @GetMapping("/get/{id}")
    public EmployeePayrollData getById(@PathVariable long id) {
        return service.getEmployeeById(id);
    }

    // create new employee
    @PostMapping("/create")
    public EmployeePayrollData create(
            @Valid @RequestBody EmployeePayrollData employee) {
        return service.createEmployee(employee);
    }

    // update employee
    @PutMapping("/update")
    public EmployeePayrollData update(
            @Valid @RequestBody EmployeePayrollData employee) {
        return service.updateEmployee(employee);
    }

    // delete employee by id
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        service.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}
