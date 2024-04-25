package com.hms.JavaBasedConfiguration;


public class Patient {
	
	
	Record record;
	int age;
	int sal;
	
	
	public Patient() {
		// TODO Auto-generated constructor stub
		System.out.println("patient object created");
	}
	
	public Patient(int age) {
		super();
		this.age = age;
	}

	public Patient(Record record, int age) {
		super();
		this.record = record;
		this.age = age;
	}
	
	public Patient(Record record, int age, int sal) {
		super();
		this.record = record;
		this.age = age;
		this.sal = sal;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void displayPatientDetails() {
		record.showRecord();
		System.out.println("in PatientDetails "+age);
	}
}
