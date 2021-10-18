package com.learnspring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_STATUS")
public class EmployeeDomain implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "employee_ID")
	private String employeeID;
	
	@Column(name = "employee_Name")
	private String employeeName;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
	
	
}
