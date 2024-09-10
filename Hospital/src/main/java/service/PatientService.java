package service;

import java.util.List;

import model.Patient;

public interface PatientService {

	void addPatient(Patient p);
	
	void deletePatient(Patient p);
	
	List <Patient> getAllPatient();
	
}
