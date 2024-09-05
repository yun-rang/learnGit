package com.example.demo.service;

import com.example.demo.commons.Result;
import com.example.demo.entity.DTO.EmployeeDTOLogin;
import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface employeeService {
    Result login(EmployeeDTOLogin employeeDTOLogin);

    Result<List<Employee>> getAllEmployees();
}
