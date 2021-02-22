package com.kononikhin.thymeleaf.thymeleafDemo.dao;

import com.kononikhin.thymeleaf.thymeleafDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
