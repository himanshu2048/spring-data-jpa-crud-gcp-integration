package com.wangs;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.wangs.controller.EmployeeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeController.class)
public class Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Application is up and running!!!");
	}
}
