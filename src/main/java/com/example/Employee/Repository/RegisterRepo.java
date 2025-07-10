package com.example.Employee.Repository;

import com.example.Employee.Modules.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepo extends JpaRepository<UserDetails,Integer> {

}
