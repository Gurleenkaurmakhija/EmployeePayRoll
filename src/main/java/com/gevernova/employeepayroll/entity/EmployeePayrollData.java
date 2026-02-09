package com.gevernova.employeepayroll.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Employee name cannot be empty")
    private String name;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private long salary;

    // constructors
    public EmployeePayrollData() {}

    public EmployeePayrollData(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    // getters
    public long getId() { return id; }
    public String getName() { return name; }
    public long getSalary() { return salary; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setSalary(long salary) { this.salary = salary; }
}
