package chapter_6;

// Math 클래스를 활용하는 예제 
public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14)); // -3.14의 절대값을 구한다 
		System.out.println(Math.sqrt(9.0));  // 9의 제곱근을 구한다 
		System.out.println(Math.exp(2)); // e^2를 구한다 
		System.out.println(Math.round(3.14)); // 3.14를 반올림한다 

		
		System.out.print("이번주 행운의 번호는 "); 
		for (int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45 + 1) + " "); 
		// 	1부터 45까지 범위에서 정수형 난수 5개 발생 
		}
}
