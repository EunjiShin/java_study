package chapter_4;

public class Circle_2 {
	// 생성자를 두개 갖는 클래스 예제 
	// Circle_2는 반지름과 이름을 필드로 갖는다 
	int radius;
	String name;

	public Circle_2() { // 매개 변수 없는 생성자
		radius = 1; name = ""; 
		// radius의 초기값은 1
	}
	public Circle_2(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; name = n;
		// 전달받은 매개변수로 반지름과 이름을 초기화한다 
	}
	public double getArea() { // 원의 면적을 구하는 메소드 
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		Circle_2 pizza = new Circle_2(10, "자바피자"); 
		// Circle_2 객체 pizza 생성, 반지름 10, 이름은 자바피자 

		double area = pizza.getArea(); // 면적을 구한 후 
		System.out.println(pizza.name + "의 면적은 " + area);
		// 이름과 면적 출력 

		Circle_2 donut = new Circle_2(); 
		// Circle_2 객체 donut 생성. 매개변수가 없으니 자동으로 반지름은 1이 된다 
		donut.name = "도넛피자";
		// 이름은 도넛피자 
		area = donut.getArea(); // 면적을 구한 후 
		System.out.println(donut.name + "의 면적은 " + area);
		// 이름과 면적 출력 
	}


}
