package inheritance;

//modification of parent.java
public class Program2 {

		private void  print1() {
			System.out.println("This is parent class");
		}
		public class Child extends Program2{
			
			public void print2() {
				
				System.out.println("This is child class");
				super.print1();
			}
			
			
		}
		public static void main(String[] args) {
			Program2 p= new Program2();
			Child c= new Child();
			
			p.print1();
			c.print2();
			
			

			
			
		}
		
		

	}

	

}
