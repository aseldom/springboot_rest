package com.zaurtregulov.spring_boot.spring_boot_rest.dao;

import com.zaurtregulov.spring_boot.spring_boot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = entityManager.createQuery("from Employee", Employee.class).getResultList();
        return employees;
    }
//
//    @Override
//    public Employee saveEmployee(Employee employee) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        return currentSession.merge("Employee", employee);
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        return currentSession.get(Employee.class, id);
//    }
//
//    @Override
//    public int deleteEmployee(int id) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        MutationQuery mutationQuery = currentSession.createMutationQuery("delete from Employee where id=:empId")
//                .setParameter("empId", id);
//        return mutationQuery.executeUpdate();
//    }
}
