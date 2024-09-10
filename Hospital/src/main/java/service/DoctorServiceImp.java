package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import model.Doctor;

public class DoctorServiceImp implements DoctorService {
		
	@Override
	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		String sql = "insert into doctor(Name,EmailId,Address,Mobile,Gender,Note)values(?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = DB.getConn().prepareStatement(sql);
			  pstm.setString(1, d.getName());
			  pstm.setString(2, d.getEmail());
			  pstm.setString(3, d.getAddress());
			  pstm.setLong(4, d.getMobile());
			  pstm.setString(5, d.getGender());
			  pstm.setString(6, d.getNote());
			  pstm.execute();
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	public List <Doctor> getAllDoctor(){
		List<Doctor> doctor= new ArrayList<>();
	String sql= "select * from doctor";
	
	try {
		Statement stm= DB.getConn().createStatement();
		ResultSet rs= stm.executeQuery(sql);
		while(rs.next()) {
			Doctor d = new Doctor();
			d.setName(rs.getString("name"));
			d.setEmail(rs.getString("email"));
			d.setAddress(rs.getString("address"));
			d.setMobile(rs.getLong("mobile"));
			d.setGender(rs.getString("gender"));
			doctor.add(d);
			
		}
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	
	}
	
		return doctor;
	
	}

		
	

	@Override
	public void deleteDoctor(Doctor d) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean addDoctor(String name, String email, String add, Long mobile, String gender, String note) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
