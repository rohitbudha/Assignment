package com.service;

import java.util.List;

import com.model.Patient;

public interface PatientService {
	void addPatient(Patient p);
	void updatePatient(int id, String name, int age, String address);
	void deletePatient(int id);
	List<Patient> getAllPatients();

}
