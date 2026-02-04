package com.gevernova.employeepayroll.service;

package com.gevernova.employeepayroll.service;

import com.gevernova.employeepayroll.entity.EmployeePayrollData;
import com.gevernova.employeepayroll.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollServiceImpl implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    // fetch all employees
    public List<EmployeePayrollData> getAllEmployees() {
        return repository.findAll();
    }

    // fetch employee by id
    public EmployeePayrollData getEmployeeById(long id) {
        return repository.findById(id).orElse(null);
    }

    // save new employee
    public EmployeePayrollData createEmployee(EmployeePayrollData employee) {
        return repository.save(employee);
    }

    // update employee data
    public EmployeePayrollData updateEmployee(EmployeePayrollData employee) {
        return repository.save(employee);
    }

    // delete employee by id
    public void deleteEmployee(long id) {
        repository.deleteById(id);
    }
}
