package com.service;

import java.util.ArrayList;
import java.util.List;
import com.model.Patient;

public class PatientServiceImp implements PatientService {

	
	
	 static List<Patient>  plist = new ArrayList<>();
	 
	  
	

	@Override
	public void addPatient(Patient p) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String sql = "insert into patient(name,age, address) values ('"+p.getName()+"','"+p.getAge()+"','"+p.getAddress()+"')";
			
			
		}
		catch  (Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void updatePatient(int id, String name, int age, String address) {
		
	   
	    try {
	    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","@rohit!!25");
	       
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String sql2 = "update patient set name = '" + name + "', age = " + age + ", address = '" + address + "' WHERE id = " + id;
	        Statement stm = con.createStatement(sql2);
	        
	        stm.executeUpdate(stm);
	         con.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
		

	@Override
	public void deletePatient(int id) {
		String sql3= " delete from patient where id= '"+ id + "'";
		 try (Statement stm = con.createStatement(sql3)) {
	            stmt.setInt(1, id);
	            stmt.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		


	@Override
	public List<Patient> getAllPatients() {
		  String sql = "SELECT * FROM patient";
        try (Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setAge(rs.getInt("age"));
                p.setAddress(rs.getString("address"));
                Patient.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return plist;
    }
		

}
