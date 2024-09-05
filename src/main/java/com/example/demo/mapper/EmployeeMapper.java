package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author yun
* @description 针对表【employee(员工信息)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.Employee
*/
@Mapper

public interface EmployeeMapper extends BaseMapper<Employee> {

    public Employee selectEmployeeByIdNumber(String idNumber);
}




