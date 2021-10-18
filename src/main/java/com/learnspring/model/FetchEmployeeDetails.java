package com.learnspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FetchEmployeeDetails {
	
	@JsonProperty("FetchDetailsRequest")
	private EmployeeDetails fetchDetailsRequest;

	public EmployeeDetails getFetchDetailsRequest() {
		return fetchDetailsRequest;
	}

	public void setFetchDetailsRequest(EmployeeDetails fetchDetailsRequest) {
		this.fetchDetailsRequest = fetchDetailsRequest;
	}
	
	

}
