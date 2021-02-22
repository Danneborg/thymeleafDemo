package com.kononikhin.thymeleaf.thymeleafDemo.service;

import com.kononikhin.thymeleaf.thymeleafDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getById(int id);

    void deleteById(int id);

    void save(Employee employee);

}
