package com.example.Employee.Controllers;

import com.example.Employee.Modules.Employee;
import com.example.Employee.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService ES;

    // Get all employees
    @GetMapping("/")
    public List<Employee> getEmployee() {
        return ES.getEmployee();
    }

    // Get employee by ID
    @GetMapping("/{empID}")
    public Employee getEmployeeById(@PathVariable int empID) {
        return ES.getEmployeeById(empID);
    }

    // Add a new employee
    @PostMapping("/add")
    public String AddingEmployee(@RequestBody Employee employee) {
        return ES.addEmployee(employee);
    }

    // Update employee
    @PutMapping
    public String UpdateEmployee(@RequestBody Employee employee) {
        return ES.updateEmployee(employee);
    }

    // Delete employee by ID
    @DeleteMapping("/{empID}")
    public String DeleteEmployee(@PathVariable int empID) {
        return ES.deleteEmployeeById(empID);
    }
}
