package com.simple.spring_mvc_hibernate_aop.dao;

import com.simple.spring_mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory; //ему нужна эта зависимость
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
//        List<Employee>allEmp = session.createQuery("from Employee ", Employee.class).getResultList();
        Query<Employee> query = session.createQuery("from Employee ", Employee.class);
        List<Employee>allEmp = query.getResultList();
        return allEmp;
    }
}
