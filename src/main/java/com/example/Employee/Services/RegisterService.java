package com.example.Employee.Services;

import com.example.Employee.Modules.UserDetails;
import com.example.Employee.Repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    RegisterRepo registerRepo;

    public String createEmployee(UserDetails userDetails) {
        registerRepo.save(userDetails);
        return "Register Successfully";
    }
}
