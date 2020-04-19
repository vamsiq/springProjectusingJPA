package com.app.springProjectusingJPA.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.app.springProjectusingJPA.dao.EmployeeDao;
import com.app.springProjectusingJPA.entity.Employee;
import com.app.springProjectusingJPA.service.EmployeeService;
@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeelist() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findOne(employeeId);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		employeeDao.delete(employeeId);
	}

}
