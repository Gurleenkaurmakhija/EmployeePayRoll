package com.gevernova.employeepayroll.service;

package com.gevernova.employeepayroll.service;

import com.gevernova.employeepayroll.entity.EmployeePayrollData;
import java.util.List;

public interface IEmployeePayrollService {

    // get all employees
    List<EmployeePayrollData> getAllEmployees();

    // get employee by id
    EmployeePayrollData getEmployeeById(long id);

    // add employee
    EmployeePayrollData createEmployee(EmployeePayrollData employee);

    // update employee
    EmployeePayrollData updateEmployee(EmployeePayrollData employee);

    // delete employee
    void deleteEmployee(long id);
}

