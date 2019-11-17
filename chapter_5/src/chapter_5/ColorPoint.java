package chapter_5;
// super()를 이용한 것
// super() : 서브 클래스에서 명시적으로 슈퍼클래스의 생성자를 선택호출한다 
// 인자를 이용해 슈퍼 클래스의 적당한 생성자를 호출하고, 반드시 서브클래스 생성자 코드의 제일 첫 라인에 와야 한다.

class Point_2{
	private int x, y; // 좌표를 멤버로 갖는다 
	public Point_2(){ // 0으로 좌표 초기화하는 생성자 
		this.x = this.y = 0;
	}
	public Point_2(int x, int y) { // 넘겨받은 매개변수로 초기화하는 생성자 
		this.x = x;
		this.y = y;
	}
	public void ShowPoint() {
		System.out.println("("+x+", "+y+")"); // 좌표를 보여준다 
	}
}


public class ColorPoint extends Point_2{
	private String color; // 색을 멤버로 갖는다 
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); //부모클래스를 이용해 초기화한다 
		this.color = color; // 색 초기화 
	}
	public void showColorPoint() {
		System.out.print(color);
		ShowPoint(); // 출력 
	}
}

class SuperEx{
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		// 객체 생성 
		cp.showColorPoint();
		// 객체 출력 
	}
	
	
}




