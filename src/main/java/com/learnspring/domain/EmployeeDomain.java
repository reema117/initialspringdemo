package com.learnspring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_STATUS")
public class EmployeeDomain implements Serializable {

	@Id
	@Column(name = "employee_ID")
	private String Employee_ID;
	
	@Column(name = "employee_Name")
	private String Employee_Name;

	public String getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(String employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	
	
}
