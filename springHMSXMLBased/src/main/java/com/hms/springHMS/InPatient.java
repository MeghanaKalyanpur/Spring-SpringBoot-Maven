package com.hms.springHMS;

public class InPatient {

	int age;
	Treatment treatment;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Treatment getTreatment() {
		return treatment;
	}
	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}
	public void showInPatientDetails() {
		// TODO Auto-generated method stub
		treatment.generalTreatment();
		System.out.println("showInPatientDetails");
	}
}
