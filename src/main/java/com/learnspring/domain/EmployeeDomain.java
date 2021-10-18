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
	private String EmployeeID;
	
	@Column(name = "employee_Name")
	private String EmployeeName;

	public String getEmployee_ID() {
		return EmployeeID;
	}

	public void setEmployee_ID(String employee_ID) {
		Employee_ID = employeeID;
	}

	public String getEmployee_Name() {
		return EmployeeName;
	}

	public void setEmployee_Name(String employee_Name) {
		EmployeeName = employee_Name;
	}
	
	
}
