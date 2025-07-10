package com.example.Employee.Repository;

import com.example.Employee.Modules.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByJob(String job);
}
