package com.learnspring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspring.domain.StatusDomain;
import com.learnspring.model.Status;
import com.learnspring.repo.StatusRepository;

@Service
public class ApiService {
	@Autowired 
	private StatusRepository statusRepository;
	
	public Status apiStatus() {
		
		Status st = new Status();
		String insertId = Long.toString(1);
		Optional<StatusDomain> statusDomain = statusRepository.findById(insertId);
		StatusDomain value = statusDomain.get();
		st.setApiStatus(value.getStatus());
		return st;
		
	}
}
