package chapter_2;

public class CircleArea {
// 원의 면적을 구하는 프로그램
	
	public static void main(String[] args) {
		final double PI = 3.14; // 원주율을 상수로 선언한다. 
		
		double radius = 10.0; // 원의 반지름을 선언한다. 
		double circleArea = radius*radius*PI; // 원의 면적 공식을 이용해 면적을 구한다.
		

		System.out.println("원의 면적 = " + circleArea);
		// 구한 원의 면적을 출력한다. 
	}

}
