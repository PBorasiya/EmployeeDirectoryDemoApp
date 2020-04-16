package com.pranav.springboot.thymeleafdemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
