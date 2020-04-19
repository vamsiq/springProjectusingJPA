package com.app.springProjectusingJPA.service;

import com.app.springProjectusingJPA.entity.Employee;
import java.util.*;


public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	List<Employee> getAllEmployeelist();
	Employee getEmployee(Long employeeId);
	void deleteEmployee(Long employeeId);
}
