package com.example.Employee.Services;

import com.example.Employee.Repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;

@Service
public class AuthService {

    @Autowired
    PasswordAuthentication passwordAuthentication;

    @Autowired
    RegisterRepo registerRepo;

    public String AddNewEmployee(RegisterRepo registerRepo){
        RegisterDe
    }
}
