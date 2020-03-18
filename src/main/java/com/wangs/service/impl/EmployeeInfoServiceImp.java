package com.wangs.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangs.entity.Employee;
import com.wangs.repository.EmployeeRepo;
import com.wangs.request.UserRequest;
import com.wangs.service.EmployeeInfoService;


@Service
public class EmployeeInfoServiceImp implements
 EmployeeInfoService{
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public String persistCustomerInfo(UserRequest request) throws Exception {		
		String str=null;
		try {
			Employee emp=new Employee();
			emp.setName(request.getName());
			emp.setDesignation(request.getRole());
			employeeRepo.save(emp);
			str="SUCCESS";
		} catch (Exception e) {
			throw e;
		}
		return str;
	}
	
	public String updateCustomerInfo(long id,UserRequest request) throws Exception {
		String str=null;
		Optional.of(id).orElseThrow(()-> new Exception("User id cannot be null"));
		try {
			Optional<Employee> emp=employeeRepo.findById(id);
			if(emp.isPresent()) {			
				emp.get().setName(request.getName());
				emp.get().setDesignation(request.getRole());
				employeeRepo.save(emp.get());
				str="SUCCESS";
			}else {
				Employee obj=new Employee();
				obj.setName(request.getName());
				obj.setDesignation(request.getRole());
				employeeRepo.save(obj);
				str="SUCCESS";
			}
		} catch (Exception e) {
			throw e;
		}
		return str;
	}
}
