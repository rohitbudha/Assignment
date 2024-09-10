package service;

import java.util.List;

import model.Doctor;


public interface DoctorService {
	
	void addDoctor(Doctor d);
	//boolean addDoctor(String name,String email,String add,Long mobile,String gender,String note);
	void deleteDoctor(Doctor d);
	
	List <Doctor> getAllDoctor();
	

}