package com.zaurtregulov.spring_boot.spring_boot_rest.dao;

import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByNameIgnoreCase(String name);
}
