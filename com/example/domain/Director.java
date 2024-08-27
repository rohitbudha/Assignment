package com.example.domain;

public class Director extends Manager {
	private double budget;
	
 public Director(int empid, String name, String ssn, double salary, String deptName, double budget){
	 super(empid, name, ssn, salary,deptName);
	 this.budget= budget; 
	
	
}

public double getBudget() {
	return budget;
}
}


