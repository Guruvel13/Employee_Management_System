package com.example.Employee.Repository;

import com.example.Employee.Modules.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterDetails,Integer> {
    RegisterDetails findByEmail(String email);
}
