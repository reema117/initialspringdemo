package com.learnspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnsping.model.Status;
import com.learnspring.service.ApiService;

@RestController 
@CrossOrigin("*")//it will take any domain 
@RequestMapping("/api/")
public class TestApiController {
	
	@Autowired 
	private ApiService apiService;
	
	
	@GetMapping(value= "serviceStatus", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> serviceStatus() {
		Status status =apiService.apiStatus();
		return new 	ResponseEntity<>(status,HttpStatus.OK);
				}
	
	
	
}
