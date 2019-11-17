package chapter_2;

public class TernaryOperator {
	// 조건 연산자를 연습하는 예제.
	
	public static void main (String[] args) {
		int a = 3, b = 5;
		
		// 삼항연산자
		// if-else 문을 간결하게 나타낼 수 있는 연산 방법. 
		// condition ? opr2 : opr3
		// condition이 true이면 opr2, false면 opr3이다. 
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
	}

}
