package com.gevernova.employeepayroll.entity;

package com.gevernova.employeepayroll.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
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
