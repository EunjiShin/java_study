package chapter_5;

// 클래스의 상속을 활용하여, (x,y)의 한 점을 표현하는 클래스와, 
// 이를 상속받아 색을 가진 점을 표현하는 클래스를 만드는 예제. 

class Point {
	// 좌표상의 한 점을 표현하는 클래스 
	
	private int x, y; // 좌표상에서 위치를 가리키는 멤버 
	
	public void set(int x, int y) { // 위치를 초기화하는 생성자 
		this.x = x; this.y = y;
	}
	
	public void showPoint() { // 좌표를 출력하는 메소드 
		System.out.println("(" + x + "," + y + ")");
	}
}


class ColorPoint2 extends Point { 
	//점을 표현하는 클래스를 상속받아, 색을 표현하는 클래스 
	
	private String color; // 점의 색을 나타내는 멤버 
	
	public void setColor(String color) {
		// 색을 초기화하는 생성자 
		this.color = color;
	}
	public void showColorPoint() { 
		// 점의 색과 좌표 출력하는 메소드 
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출 
	}
}



public class ColorPointEx {
	public static void main(String [] args) {
		Point p = new Point(); // Point 클래스의 객체 p 생성
		p.set(1, 2); // p 초기화 
		p.showPoint(); // p의 좌표 출력 

		ColorPoint2 cp = new ColorPoint2(); // ColorPoint 클래스의 객체 cp 생성 
		cp.set(3, 4); // cp 초기화 
		cp.setColor("red"); // cp 색 초기화 
		cp.showColorPoint(); // 컬러와 좌표 출력
	}

}
