package com.example.demo.service.Impl;

import com.example.demo.commons.Constant.ResultConstant;
import com.example.demo.commons.Result;
import com.example.demo.entity.DTO.EmployeeDTOLogin;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeServiceImpl implements employeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Result login(EmployeeDTOLogin e) {
        Result result = new Result();
        if(e.getIdNumber() == null || e.getPassword() == null){
            return result.fail(ResultConstant.EMPLOYEE_LOGIN_NULL);
        }
        Employee emp = employeeMapper.selectEmployeeByIdNumber(e.getIdNumber());
        if(emp == null){
            return result.fail(ResultConstant.EMPLOYEE_NULL);
        }
        if(emp.getPassword().equals(e.getPassword())){
            result.success(emp);
        }
        return result;
    }

    @Override
    public Result<List<Employee>> getAllEmployees() {
        Result<List<Employee>> result = new Result<>();

        return result.success(employeeMapper.selectList(null));

    }


}
