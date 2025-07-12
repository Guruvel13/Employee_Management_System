package com.example.Employee.Services;

import com.example.Employee.Modules.Employee;
import com.example.Employee.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo empRepo;

    public List<Employee> getEmployee(){
        return empRepo.findAll();
    }

    public Employee getEmployeeById (int empID){
        return empRepo.findById(empID).orElse(new Employee());
    }

    public String addEmployee (Employee employee){
        empRepo.save(employee);
        return "Employee Added Successfully!";
    }

    public String updateEmployee (Employee employee){
        empRepo.save(employee);
        return "Employee Updated Successfully!";
    }

    public String deleteEmployeeById (int empID){
        empRepo.deleteById(empID);
        return "Employee updated Successfully";
    }
}
