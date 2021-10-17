package com.learnspring.service;

import org.springframework.stereotype.Service;

import com.learnsping.model.Status;

@Service
public class ApiService {

	public Status apiStatus() {
		
		Status st = new Status();
		st.setApiStatus("The value returned as");
		return st;
		
	}
}
