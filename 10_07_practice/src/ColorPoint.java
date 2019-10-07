// super()를 이용한 것
// super() : 서브 클래스에서 명시적으로 슈퍼클래스의 생성자를 선택호출한다 
// 인자를 이용해 슈퍼 클래스의 적당한 생성자를 호출하고, 반드시 서브클래스 생성자 코드의 제일 첫 라인에 와야 한다.

class Point{
	private int x, y;
	public Point(){
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void ShowPoint() {
		System.out.println("("+x+", "+y+")");
	}
}


public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		ShowPoint();
	}
}

class SuperEx{
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}
	
	
}




