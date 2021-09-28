package com.dwll.employeemanager.repo;

import java.util.Optional;

import com.dwll.employeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional findEmployeeById(Long id);
    
}
