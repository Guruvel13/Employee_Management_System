package com.example.Employee.Controllers;

import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<RegisterDetails> getAllEmployees() {
        return employeeService.getMethod();
    }

    @GetMapping("/{empId}")
    public RegisterDetails getEmployeeById(@PathVariable int empId) {
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping
    public String addEmployee(@RequestBody RegisterDetails employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{empId}")
    public String updateEmployee(@PathVariable int empId) {
        return employeeService.updateEmployee(empId);
    }

    @DeleteMapping("/{empId}")
    public String deleteEmployee(@PathVariable int empId) {
        return employeeService.deleteEmployeeById(empId);
    }
}