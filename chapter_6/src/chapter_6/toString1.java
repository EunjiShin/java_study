package chapter_6;


//객체를 문자열로 리턴하고, 객체를 비교하는 equals 메소드 활용하는 예제 

class Point{
	int x, y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		// 객체를 문자열로 리턴하는 toString()메소드 
		return "Point(" + x + "," + y + ")";
	}
	
	public boolean equals(Point p) {
		// 좌표가 같으면 true를 리턴하는 equals() 메소드 
		if(x == p.x && y == p.y) return true;
		else return false;
	}
	
}

class Rect{
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Rect p) {
		if(width*height == p.width*p.height) { 
			//넓이가 같으면 true를 리턴하는 equals() 메소드 
			return true;
		}
		else return false;
	}
}




public class toString1{
	public static void main(String[]args) {
		Point a = new Point(2, 3);
		Point d = new Point(2, 3);
		Point c = new Point(5, 6);
		// 객체 생성 
		System.out.println(a.toString());
		// 문자열로 바꾸어 출력 
		System.out.println(a);
		
		
		String b = a.toString() + "점";
		// 문자열로 바꾸고 문자열 추가해서 저장 
		
		System.out.println(b);
		System.out.println(b.toString());
		
		if(a == d) System.out.println("a == d"); // false이므로 출력 x 
		if(a.equals(d)) System.out.println("a is equal to d"); // true - 출력o
		if(a.equals(c)) System.out.println("a == c");
		
		Rect x = new Rect(3, 4);
		Rect y = new Rect(5, 6);
		Rect z = new Rect(7, 8);

		if(x.equals(y)) System.out.println("x == y"); 
		else System.out.println("not same");
		
		if(x.equals(z)) System.out.println("x == z");
		else System.out.println("not same");
		
		if(y.equals(z)) System.out.println("y == z");
		else System.out.println("not same");
		
		
		
	}
}