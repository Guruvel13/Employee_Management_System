package com.example.Employee.Repository;

import com.example.Employee.Modules.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
