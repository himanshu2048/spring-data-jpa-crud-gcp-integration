package com.wangs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wangs.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
