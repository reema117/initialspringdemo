package com.learnspring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspring.domain.StatusDomain;
import com.learnspring.model.EmployeeDetails;
import com.learnspring.model.FetchEmployeeDetails;
import com.learnspring.model.Status;
import com.learnspring.repo.EmployeeRepository;
import com.learnspring.repo.StatusRepository;

@Service
public class ApiService {
	@Autowired 
	private StatusRepository statusRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	public Status apiStatus() {
		
		Status st = new Status();
		//String insertId = Long.toString(1);
		Optional<StatusDomain> statusDomain = statusRepository.findById(Long.parseLong("1"));
		StatusDomain value = statusDomain.get();
		st.setApiStatus(value.getStatus());
		return st;
		
	}
	
	public EmployeeDetails apiEmployee(FetchEmployeeDetails fetchEmployeeDetails) {
		
		EmployeeDetails apiEmp = new EmployeeDetails();
		apiEmp = employeeRepository.findByEmployee_ID(fetchEmployeeDetails.getFetchDetailsRequest().getEmployeeId());
		System.out.println("api emp is " +apiEmp.getEmplyeeName());
		return apiEmp;
		
	}
}
