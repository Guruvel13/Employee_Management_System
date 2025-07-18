package com.example.Employee.Services;

import com.example.Employee.Modules.RegisterDetails;
import com.example.Employee.Modules.UserDetailsDto;
import com.example.Employee.Repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    RegisterDetailsRepository registerDetailsRepository;

    public String addNewEmployee(UserDetailsDto register) {
        RegisterDetails registerDetails = new RegisterDetails();
        registerDetails.setName(register.getName());
        registerDetails.setEmail(register.getEmail());
        registerDetails.setPassword(register.getPassword());
        registerDetails.setUserName(register.getUserName());
        registerDetailsRepository.save(registerDetails);
        return "Employee Added Successfully";
    }
}