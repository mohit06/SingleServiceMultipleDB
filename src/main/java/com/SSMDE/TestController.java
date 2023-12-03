package com.SSMDE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SSMDE.primary.Employee;
import com.SSMDE.primary.EmployeeRepository;
import com.SSMDE.secondary.Manager;
import com.SSMDE.secondary.ManagerRepository;

@RestController
public class TestController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ManagerRepository managerRepository;

	@RequestMapping(value="/primary", method=RequestMethod.GET)
	public List<Employee> getPrimaryDatabaseData() {
		List<Employee> list = employeeRepository.findAll();
		return list;
	}
	
	@RequestMapping(value="/secondary", method=RequestMethod.GET)
	public List<Manager> getSecondaryDatabaseData() {
		List<Manager> list = managerRepository.findAll();
		return list;
	}
}