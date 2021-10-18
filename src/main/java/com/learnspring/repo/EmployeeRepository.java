package com.learnspring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learnspring.domain.EmployeeDomain;
import com.learnspring.domain.StatusDomain;
import com.learnspring.model.EmployeeDetails;



@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDomain, String> {

	EmployeeDetails findByEmployeeID(String employeeId);
		
}

