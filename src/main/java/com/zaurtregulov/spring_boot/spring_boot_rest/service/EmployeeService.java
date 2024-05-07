package com.zaurtregulov.spring_boot.spring_boot_rest.service;


import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    List<Employee> findAllByName(String name);

    Employee saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
