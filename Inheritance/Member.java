package inheritance;

public class Member {
String Name;
int age;
int phonenumber;
String Address;
int salary;

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}


public void printSalary() {
	System.out.println("salary:"+salary);
	
}
public void display() {
	System.out.println("name:"+Name);
	System.out.println("age:"+age);
	System.out.println("Phone Number:"+phonenumber);
	System.out.println("Address:"+Address);
	System.out.println("Salary:"+salary);
	
}

	
}

public class Employee extends Member{
	public Employee(String Name,int age,int phonenumber,String Address,int salary){
		super(Name, age, phonenumber,Address, salary);
	}
	
	String specialization;
	
	
}
public class Manager extends Member{
	public Manager(String Name,int age,int phonenumber,String Address,int salary){
		super(Name, age, phonenumber,Address, salary);
	}
	String department;
	
	
}
public class Test{
	public static void main(String[] args) {
		Employee emp= new Employee();
		Manager m= new Manager();
		emp.setName("ram");
		emp.setAge(25);
		emp.setAddress("mnr");
		emp.setPhonenumber(984800000);
		emp.setSalary(25000);
		emp.display();
		
		m.setName("hari");
		m.setAge(27);
		m.setAddress("dhn");
		m.setPhonenumber(984805000);
		m.setSalary(20000);
		m.display();
		
		
		
		
	}
}




