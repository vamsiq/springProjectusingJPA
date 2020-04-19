package com.app.springProjectusingJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee")
@Setter
@Getter
public class Employee 
{
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long employeeId;
	@Column(name="employeeName")
	private String employeeName;
	@Column(name="designation")
	private String designation;
}
