package inheritance;

public class Rectangle {
	int length;
	int breadth;
	 public  Rectangle(int length, int breadth) {
		 this.length=length;
		 this.breadth=breadth;
		}
	public void area(int length, int breadth) {
		int area= length*breadth;
		int perimeter= 2*(length+breadth);
		System.out.println("rectangle");
		System.out.println("area:"+area);
		System.out.println("perimeter:"+perimeter);
		
		
	}
	public class Square extends Rectangle{
		int s;
		public Square(int length, int breadth) {
			super(length, breadth);
			
		}
		
		public void area(int s) {
			int area= s*s;
			int perimeter= 4*s;
			System.out.println("square");
			System.out.println("area:"+area);
			System.out.println("perimeter:"+perimeter);
			
		}
	
		public static void main(String[] args) {
			Rectangle r= new Rectangle();
			Square s = new Square();
			r.area(10, 20);
			s.area(4);
			
			
		}
		
		
		
	}
	
	
	
	
	 
	 
	 
	 

}
