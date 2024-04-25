package com.hms.springJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hms.springJDBCEx.model.Patient;
import com.hms.springJDBCEx.service.PatientService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcExApplication.class, args);
		
		Patient patient= context.getBean(Patient.class);
		patient.setId(101);
		patient.setName("p101");
		patient.setAmount(1);
		
		PatientService service = context.getBean(PatientService.class);
		service.addPatient(patient);
		
		List<Patient> patientDetails=service.getPatients();
		System.out.println(patientDetails);
	}

}
