package com.learnsping.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
	
	@JsonProperty("status")
	private String apiStatus;

	public String getApiStatus() {
		return apiStatus;
	}

	public void setApiStatus(String apiStatus) {
		this.apiStatus = apiStatus;
	}

	
	
}
