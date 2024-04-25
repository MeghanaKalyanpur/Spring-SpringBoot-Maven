package com.hms.JavaBasedConfiguration.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.hms.JavaBasedConfiguration.InPatient;
import com.hms.JavaBasedConfiguration.Patient;
import com.hms.JavaBasedConfiguration.PhysicalMedicine;
import com.hms.JavaBasedConfiguration.Record;
import com.hms.JavaBasedConfiguration.Treatment;

@Configuration
public class AppConfigJava {
	
	@Bean(name = {"pm1","pm2","pm3"})//by default bean name is function name
	//but if needed to be specified by specific name  can name it as above
//	@Bean
	@Scope(value = "prototype")
	@Primary
	public PhysicalMedicine physicalMedicine() {
		return new PhysicalMedicine();
	}
	
	@Bean
	public Patient patient(@Autowired Record record) {
		Patient patient= new Patient();
		patient.setRecord(record);
		return patient;
	}
	
	@Bean
	public com.hms.JavaBasedConfiguration.Record record() {
		return new Record();
	}
	
	@Bean
	public InPatient inPatient(@Autowired Treatment treatment) {
		InPatient patient= new InPatient();
		patient.setTreatment(treatment);
		return patient;
	}
}
