package com.hms;

import org.springframework.stereotype.Component;

@Component
public class Record {
	
	String medicine;
	String diagnosis;
	
	public void show() {
		System.out.println("Medicines and diagnosys");

	}

}
