package com.learnspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDetails {
	
	@JsonProperty("EmployeeId")
	private String employeeId;
	
	@JsonProperty("EmplyeeName")
	private String emplyeeName;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmplyeeName() {
		return emplyeeName;
	}

	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}
	

}
