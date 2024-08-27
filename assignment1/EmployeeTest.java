package assignment1;

import com.example.domain.Director;

public class EmployeeTest {
	public static void main(String[] args) {
		
		//Employee emp= new Employee();
	   // emp.setName("John smith");
	   
		
	  Employee emp= new Employee(1,"Ram",1212,55555.55);
	  		
	  		
	
		

	Engineer en= new Engineer( 101,"John Smith", 012-34-5678, 12034.75);
	
		
		Manager m= new Manager(207,"Barbara Johnson",054-12-2367,109501.36,"US marketing");
		
		Admin a= new Admin(304,"Bill Mouroe",108-23-6509,75002.34);
		Director d = new Director(12,"Susan Wheeler", 099-45-2340,120567.36,"Gloabal Marketing",1000000.00);
		
		emp.printEmployee();
		en.printEmployee();
		m.printEmployee();
		a.printEmployee();
		d.printEmployee();
		
	}

	
}
