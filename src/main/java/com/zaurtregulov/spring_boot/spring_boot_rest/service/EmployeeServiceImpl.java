package com.zaurtregulov.spring_boot.spring_boot_rest.service;

import com.zaurtregulov.spring_boot.spring_boot_rest.dao.EmployeeRepository;
import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//    @Autowired
//    private EmployeeDAO employeeDAO;
//
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
//    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();

    }

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByNameIgnoreCase(name);
    }

    @Override
//    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
//    @Transactional
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
//    @Transactional
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
