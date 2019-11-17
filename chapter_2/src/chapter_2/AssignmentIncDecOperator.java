package chapter_2;


public class AssignmentIncDecOperator {
	// 대입 연산자와 증감 연산자를 연습하는 예제
	// 대입 연산 - 연산의 오른쪽 결과는 왼쪽 변수에 대입된다. 
	
	public static void main(String[] args) {
		int a=3, b=3, c=3;

		// 대입 연산자 
		
		a += 3; 		// a=a+3 
		b *= 3; 		// b=b*3
		c %= 2; 		// c=c%2 
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		int d=3;
		// 증감 연산자 
		
		a = d++; 	// a에 d를 대입한 후, d를 1 증가시킨다. a=3, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; 	// a에 1 증가한 d를 대입한다. d=5, a=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; 		// a에 d를 대입한 후, d를 1 감소시킨다. a=5, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d; 		// a에 1 감소한 d를 대입한다. d=3, a=3
		System.out.println("a=" + a + ", d=" + d);
	}

}
