package com.gevernova.employeepayroll.repository;

package com.gevernova.employeepayroll.repository;

import com.gevernova.employeepayroll.entity.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository layer for database operations

@Repository
public interface EmployeePayrollRepository
        extends JpaRepository<EmployeePayrollData, Long> {
}
