package com.example.Employee.Controllers;

import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Modules.UserDetailsDto;
import com.example.Employee.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public String addNewUser(@RequestBody UserDetailsDto register){
        return authService.addNewEmployee(register);
    }

    @PostMapping("/login")
    public <AuthResponse> ResponseEntity<AuthResponse> Login(@RequestBody RegisterDetails login){
        AuthResponse response = (AuthResponse) authService.authenticate(login);  // or employeeService if it’s there
        return ResponseEntity.ok(response);
    }
}