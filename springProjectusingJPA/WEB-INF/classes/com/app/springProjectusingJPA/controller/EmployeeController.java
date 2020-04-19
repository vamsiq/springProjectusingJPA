package com.app.springProjectusingJPA.controller;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springProjectusingJPA.entity.Employee;
import com.app.springProjectusingJPA.service.EmployeeService;
@RequestMapping("employee")
@RestController
public class EmployeeController {
	private EmployeeService employeeService;
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}	
	@GetMapping("/all")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployeelist();
	}
	@GetMapping("/by/{employeeId}")
	public Employee getEmployee(@PathVariable(name="employeeId") Long employeeId)
	{
		return employeeService.getEmployee(employeeId);
	}
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable(name="employeeId") Long employeeId)
	{
		employeeService.deleteEmployee(employeeId);
	}
}
