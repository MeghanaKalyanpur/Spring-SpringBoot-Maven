package com.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Patient {
//	int id;
//	String name;
//
//	public Patient(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}

	@Autowired
	Record record;
	
	public void printPatientDetails() {
		
		record.show();
		System.out.println("Name:"/* +name+" Id:"+id */);
	}
}
