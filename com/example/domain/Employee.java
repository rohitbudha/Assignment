package com.example.domain;

public class Employee {

		private int empid;
		private String name;
		private String ssn;
		private double salary;

		public Employee(int empid, String name, String ssn, double salary){
			this.empid= empid;
			this.name=name;
			this.ssn=ssn;
			this.salary= salary;
		}
		
		public int getEmpid() {
			return empid;
		}

		public String getSsn() {
			return ssn;
		}

		public String getName() {
			return name;
		}
		
		public double getSalary() {
			return salary;
		}

		public void setName(String name) {

			
	    }



		public void raiseSalaray (double increase) {
			
		}
		

		
		
		public void printEmployee()
		{
			System.out.println("empId:"+empid);
			System.out.println("name:"+name);
			System.out.println("ssn:"+ssn);
			System.out.println("salary:"+salary);
			
	     }

		
	}



