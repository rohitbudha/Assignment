package inheritance;

public class Parent {
	public void print1() {
		System.out.println("This is parent class");
	}
	public class Child extends Parent{
		public void print2() {
			
			System.out.println("This is child class");
			super.print1();
		}
		
		
	}
	public static void main(String[] args) {
		Parent p= new Parent();
		Child c= new Child();
		
		p.print1();
		c.print2();
		c.print2();
		
		

		
		
	}
	
	

}
