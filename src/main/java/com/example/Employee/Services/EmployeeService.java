package com.example.Employee.Services;

import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Repository.RegisterDetailsRepository;
import com.example.springbootfirst.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeTaskRepository taskRepository;

    @Autowired
    private RegisterDetailsRepository registerRepo;

    public String createTask(int employeeId, Employee task) {
        RegisterDetails employee = registerRepo.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        task.setEmployee(employee);
        EmployeeTask savedTask = taskRepository.save(task);
        employee.getTasks().add(savedTask);
        registerRepo.save(employee);

        return "Task is created";
    }


    public String updateTask(int taskId, EmployeeTask updatedTask) {
        EmployeeTask existingTask = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setDueDate(updatedTask.getDueDate());

        return "Task is updated";
    }


    public String deleteTask(int taskId) {
        EmployeeTask task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        taskRepository.delete(task);
        return "Task is deleted";
    }


    public List<EmployeeTask> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<EmployeeTask> getTasksByEmployeeId(int employeeId) {
        return taskRepository.findByEmployeeEmpId(employeeId);
    }
}