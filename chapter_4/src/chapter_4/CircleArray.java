package chapter_4;
// 객체 배열 예제 

class Circle_3 {
	int radius; // 반지름을 멤버로 가지는 클래스 
	
	public Circle_3(int radius) {
		// 매개변수로 반지름을 초기화하는 생성자 
		this.radius = radius;
	}
	
	public double getArea() {
		// 면적을 구하는 메소드 
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	
	public static void main(String[] args) {
		Circle_3 [] c; 
		c = new Circle_3[5]; 	
		// 5칸짜리 Circle_3 객체 배열 생성 

		for(int i=0; i<c.length; i++) // 배열 길이만큼 반복하면서 
			c[i] = new Circle_3(i); // 초기화 
		
		for(int i=0; i<c.length; i++)  // 배열 길이만큼 반복 - 각 배열 원소에 접근 
			System.out.print((int)(c[i].getArea()) + " ");
		// 객체 배열의 원소마다 면적 출력 
	} 

}
