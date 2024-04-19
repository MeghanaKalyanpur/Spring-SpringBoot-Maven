package com.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HospitalManagementSystemApplication {
	
	@Autowired
	Patient p;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HospitalManagementSystemApplication.class, args);
		System.out.println("Hello World");
		Patient p= applicationContext.getBean(Patient.class);
		p.printPatientDetails();
	}

}
