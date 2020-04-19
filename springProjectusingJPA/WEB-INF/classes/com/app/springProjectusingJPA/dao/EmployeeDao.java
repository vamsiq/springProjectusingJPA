package com.app.springProjectusingJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.springProjectusingJPA.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
