package com.learnspring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learnspring.domain.EmployeeDomain;
import com.learnspring.domain.StatusDomain;



@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDomain, String> {
		
}

