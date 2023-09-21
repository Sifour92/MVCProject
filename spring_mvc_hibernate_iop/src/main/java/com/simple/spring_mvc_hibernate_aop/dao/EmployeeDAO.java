package com.simple.spring_mvc_hibernate_aop.dao;

import com.simple.spring_mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();
}
