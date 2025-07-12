package com.example.Employee.Services;


import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    RegisterRepo registerRepo;

    public String addNewEmployee (RegisterDetails registerDetails){
        RegisterDetails registerDetails1 = new RegisterDetails();

        registerDetails1.setEmpId(registerDetails.getEmpId());
    }
}
