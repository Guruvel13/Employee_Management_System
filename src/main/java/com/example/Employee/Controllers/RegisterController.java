package com.example.Employee.Controllers;

import com.example.Employee.Services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Employee.Modules.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/register")
public class RegisterController {

    @Autowired
    private RegisterService rs;

    @PostMapping
    public String createEmployee(@RequestBody UserDetails userDetails){
        return rs.createEmployee(userDetails);
    }
}
