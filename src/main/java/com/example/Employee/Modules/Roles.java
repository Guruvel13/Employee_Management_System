package com.example.Employee.Modules;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int roleId;
    private  String roleName;
}
