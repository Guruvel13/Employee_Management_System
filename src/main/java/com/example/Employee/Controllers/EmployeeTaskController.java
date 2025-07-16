package com.example.Employee.Controllers;

import com.example.Employee.Services.EmployeeService;
import com.example.springbootfirst.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/tasks")
public class EmployeeTaskController {

    @Autowired
    private EmployeeService taskService;

    @PostMapping("/employee/{employeeId}")
    public String createTask(@PathVariable int employeeId, @RequestBody Employee task) {
        return taskService.createTask(employeeId, task);
    }

    @GetMapping
    public List<Employee> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/employee/{employeeId}")
    public List<EmployeeTask> getTasksByEmployee(@PathVariable int employeeId) {
        return taskService.getTasksByEmployeeId(employeeId);
    }

    @PutMapping("/{taskId}")
    public String updateTask(@PathVariable int taskId, @RequestBody EmployeeTask updatedTask) {
        return taskService.updateTask(taskId, updatedTask);
    }

    @DeleteMapping("/{taskId}")
    public String deleteTask(@PathVariable int taskId) {
        return taskService.deleteTask(taskId);
    }
}