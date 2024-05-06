package com.zaurtregulov.spring_boot.spring_boot_rest.dao;



import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployee();

    Employee saveEmployee(Employee employee);

    Employee getEmployee(int id);

    int deleteEmployee(int id);

}
