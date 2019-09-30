import java.util.Scanner;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

class opject_Array {
	public static void main(String[] args) {
		Circle [] c; 
		c = new Circle[5]; 		

	System.out.print("예제 4-6 \n");
	
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i); 
		
		for(int i=0; i<c.length; i++) 
			System.out.print((int)(c[i].getArea()) + " ");
	}
}


