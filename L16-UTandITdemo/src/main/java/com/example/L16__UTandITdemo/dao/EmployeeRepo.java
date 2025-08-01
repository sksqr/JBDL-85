package com.example.L16__UTandITdemo.dao;

import com.example.L16__UTandITdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    Employee findByEmail(String email);

    List<Employee> findByName(String name);
}
