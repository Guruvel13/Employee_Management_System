package com.example.Employee.Controllers;

import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Modules.UserDetailsDto;
import com.example.Employee.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public ResponseEntity<String> addUserDetails(@RequestBody UserDetailsDto userDetails) {
        String message = authService.addUserDetails(userDetails);
        return ResponseEntity.ok(message);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody RegisterDetails userDetails) {
        String message = authService.authenticate(userDetails);
        return ResponseEntity.ok(message);
    }
}
