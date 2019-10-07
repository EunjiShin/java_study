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
