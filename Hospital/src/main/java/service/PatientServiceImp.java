package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import model.Patient;

public class PatientServiceImp implements PatientService {
		
	@Override
	public void addPatient(Patient p) {
		// TODO Auto-generated method stub
		String sql = "insert into patient(fname,lname,gender,phone,dob,mstatus,paddress,caddress,history,other)values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = DB.getConn().prepareStatement(sql);
			  pstm.setString(1, p.getFname());
			  pstm.setString(2, p.getLname());
			  pstm.setString(3, p.getGender());
			  pstm.setLong(4, p.getPhone());
			 pstm.setDate(5, p.getDob());
			  pstm.setString(6, p.getMarriage());
			  pstm.setString(7, p.getPaddress());
			  pstm.setString(8, p.getCaddress());
			  pstm.setString(9, p.getHistory());
			  pstm.setString(10, p.getDetails());
			  pstm.execute();
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	public List <Patient> getAllPatient(){
		List<Patient> patient= new ArrayList<>();
	String sql= "select * from patient";
	
	try {
		Statement stm= DB.getConn().createStatement();
		ResultSet rs= stm.executeQuery(sql);
		while(rs.next()) {
			Patient p = new Patient();
			p.setFname(rs.getString("fname"));
			p.setLname(rs.getString("lname"));
			p.setGender(rs.getString("gender"));
			p.setPhone(rs.getLong("phone"));
			p.setDob(rs.getDate("dob"));
			p.setMarriage(rs.getString("status"));
			p.setPaddress(rs.getString("paddress"));
			p.setCaddress(rs.getString("caddress"));
			p.setHistory(rs.getString("history"));

			p.setDetails(rs.getString("details"));


			patient.add(p);
			
		}
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	
	}
	
		return patient;
	
	}


	@Override
	public void deletePatient(Patient p) {
		// TODO Auto-generated method stub
		
	}



		
	


}
