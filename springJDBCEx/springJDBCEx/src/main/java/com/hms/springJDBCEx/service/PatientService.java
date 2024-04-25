package com.hms.springJDBCEx.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.springJDBCEx.model.Patient;
import com.hms.springJDBCEx.repo.PatientRepo;

@Service
public class PatientService {
	
	private PatientRepo repo;
	public PatientRepo getRepo() {
		return repo;
	}
	@Autowired
	public void setRepo(PatientRepo repo) {
		this.repo = repo;
	}
	public void addPatient(Patient patient) {
		repo.save(patient);
	}
	public List<Patient> getPatients() {
		return repo.findAll();
	}
}
