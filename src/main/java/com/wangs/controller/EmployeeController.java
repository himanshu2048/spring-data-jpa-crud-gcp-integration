package com.wangs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangs.request.UserRequest;
import com.wangs.service.EmployeeInfoService;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = EmployeeInfoService.class)
public class EmployeeController {

	@Autowired
	EmployeeInfoService service;

	@PostMapping(value = "/persistEmployeeInfo", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> persist(@Valid @RequestBody  UserRequest request) throws Exception {
		return new ResponseEntity<>(service.persistCustomerInfo(request), HttpStatus.CREATED);
		
	}
	
	@PutMapping(value = "/updateEmployeeRecord/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> update(@Valid@PathVariable("id") long id,@RequestBody UserRequest request) throws Exception {
		return new ResponseEntity<>(service.updateCustomerInfo(id, request), HttpStatus.OK);	
	}

}