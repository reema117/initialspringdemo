package com.learnspring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnsping.model.Status;
import com.learnspring.domain.StatusDomain;
import com.learnspring.repo.StatusRepository;

@Service
public class ApiService {
	@Autowired 
	private StatusRepository statusRepository;
	
	public Status apiStatus() {
		
		Status st = new Status();
		Optional<StatusDomain> statusDomain = statusRepository.findById("1");
		StatusDomain value = statusDomain.get();
		st.setApiStatus(value.getStatus());
		return st;
		
	}
}
