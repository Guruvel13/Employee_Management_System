package com.example.Employee.Controllers;

import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Modules.UserDetailsDto;
import com.example.Employee.Services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class EmployeeTaskControllerTest {

    @Mock
    EmployeeService employeeService;

    @Mock
    EmployeeTaskController employeeTaskController;

    @Test
    void testGetEmployeeById() {
        RegisterDetails emp = new RegisterDetails();
        emp.setEmpId(1);
        emp.setName("Test Employee");

        when(employeeService.getEmployeeById(1)).thenReturn(emp);
        RegisterDetails result = employeeTaskController.getEmployeeById(1);

        assertNotNull(result);
        assertEquals("Test Employee", result.getName());
    }

    @Test
    void testGetEmployeeByRole() {
        RegisterDetails emp = new RegisterDetails();
        emp.setEmpId(1);
        emp.setName("Admin");

        when(employeeService.getEmployeeByRole("ADMIN")).thenReturn(emp);
        RegisterDetails result = employeeTaskController.getEmployeeByRole("ADMIN");

        assertNotNull(result);
        assertEquals("Admin", result.getName());
    }

    @Test
    void testPostMethod() {
        UserDetailsDto dto = new UserDetailsDto();
        dto.setEmpId(1);
        dto.setName("John");

        when(employeeService.addEmployee(dto)).thenReturn("Employee Added Successfully");
        String result = employeeTaskController.postMethod(dto);

        assertEquals("Employee Added Successfully", result);
    }

    @Test
    void testPutMethod() {
        UserDetailsDto dto = new UserDetailsDto();
        dto.setName("Updated Name");

        when(employeeService.updateEmployee(1, dto)).thenReturn("Employee updated successfully");
        String result = employeeTaskController.putMethod(1, dto);

        assertEquals("Employee updated successfully", result);
    }

    @Test
    void testDeleteMethod() {
        when(employeeService.deleteEmployee(1)).thenReturn("Employee deleted successfully");
        String result = employeeTaskController.deleteMethod(1);

        assertEquals("Employee deleted successfully", result);
    }
