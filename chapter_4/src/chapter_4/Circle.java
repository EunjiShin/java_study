package chapter_4;

public class Circle {
// 반지름과 이름을 필드로 갖는 Circle 클래스를 이용해 객체를 생성하는 예제 
	
	int radius; 					// 원의 반지름
	String name; 				// 원의 이름

	public Circle() { }			// 원의 생성자

	public double getArea() { 	// 원의 면적을 계산하는 메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		Circle pizza; // Circle 클래스의 객체 pizza 선언 
		pizza = new Circle(); 					// Circle 객체 pizza 생성
		pizza.radius = 10; 						// 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; 			// 피자의 이름 설정
		double area = pizza.getArea(); 		// 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		// pizza 객체의 면적과 이름 출력 

		Circle donut = new Circle(); 		// Circle 객체 donut 생성
		donut.radius = 2; 						// 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; 			// 도넛의 이름 설정
		area = donut.getArea(); 				// 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);
		// donut 객체의 면적과 이름 출력 
	}

	
}

/*
 *<객체를 생성하고 접근하기>
 * 1. 레퍼런스 변수를 선언한다 
 * 2. new연산자를 이용, 객체를 생성한다 - new 키워드는 객체의 생성자를 호출한다 
 * 3. .연산자를 이용, 객체의 멤버에 접근한다 
 * */
