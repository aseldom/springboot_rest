package com.zaurtregulov.spring_boot.spring_boot_rest.dao;

import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployee() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public int deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from Employee where id=:empId")
                .setParameter("empId", id);
        return query.executeUpdate();
    }
}
