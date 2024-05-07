package com.zaurtregulov.spring_boot.spring_boot_rest.controller;

import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;
import com.zaurtregulov.spring_boot.spring_boot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee != null) {
            employeeService.deleteEmployee(id);
            return "Employee with id: " + id + " was deleted";
        }
        return "";
    }

    @GetMapping("employees/name/{name}")
    public List<Employee> findAllEmployee(@PathVariable String name) {
        return employeeService.findAllByName(name);
    }

}
