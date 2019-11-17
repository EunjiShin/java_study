package chapter_5;
// 메소드 오버라이딩으로 다형성을 실현하는 예제 프로그램 

class Shape {
	protected String name;
	public Shape next;
	public Shape() {next = null;}
	public void paint() {
		draw(); // 동적 바인딩 - 오버라이딩 메소드. 실행할 메소드를 런타임때 결정해서, 오버라이딩!
	}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	protected String name;
	@Override
	public void draw() {
		name = "Circle";
		System.out.println("Circle");
		super.name = "Shape";
		super.draw();
	}
}



class MethodOverridingEx {
	
	static void paint(Shape p) 
	{ 
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
	}

	public static void main(String[] args) {
		
		Line line = new Line();
		paint(line); 
		paint(new Shape()); 
		paint(new Line()); 
		paint(new Rect()); 
		paint(new Circle()); 
		
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // Line 객체 연결
		last = start;
		obj = new Rect();
		last.next = obj; // Rect 객체 연결
		last = obj;
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle 객체 연결
		last.next = obj;
		// 모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}			
	}
}




/*<메소드 오버라이딩 - 다형성 실현> 
 * 슈퍼 클래스에 선언된 메소드를 각 서브 클래스들이 자신만의 내용으로 새로 구현하는 기능. 
 * 상속을 통해 하나의 인터페이스에 서로 다른 내용을 구현한다 - 다형성 
 * 동적 바인딩을 통해 실행 중에 다형성을 실현한다
 * 오버 로딩은 컴파일 시간에 다형성을 실현하는 예이다 
 * */
