package com.example.demo.controller;

import com.example.demo.commons.Result;
import com.example.demo.entity.DTO.EmployeeDTOLogin;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.employeeService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Schema(description = "员工接口")
@RestController
@RequestMapping("/admin")
public class employeeController {

    @Autowired
    private employeeService employeeService;

    @Schema(description = "员工登录")
    @PutMapping("/login")
    public Result login(@RequestBody EmployeeDTOLogin employeeDTOLogin) {
//        Result res = new Result<>();
        return employeeService.login(employeeDTOLogin);
    }

    @Schema(description = "查看员工信息")
    @GetMapping("/employee")
    public Result<List<Employee>> getEmployee() {
        return employeeService.getAllEmployees();
    }
}
