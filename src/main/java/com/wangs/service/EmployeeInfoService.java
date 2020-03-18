package com.wangs.service;

import com.wangs.request.UserRequest;

public interface EmployeeInfoService {
	
	String persistCustomerInfo(UserRequest request) throws Exception; 
	
    String updateCustomerInfo(long id,UserRequest request) throws Exception;

}
