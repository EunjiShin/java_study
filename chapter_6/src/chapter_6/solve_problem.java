package chapter_6;

// 6단원 개념을 연습하는 예제 
// 문자열을 복습한다. 레퍼런스 개념의 이해 
public class solve_problem {
	
	public static void main(String[]args) {
		String a = "가나다라";
		System.out.println(a == "가나다라");
		// 문자열 비교 
		
		String b = new String(a);
		System.out.println(a == b);
		// 객체비교 
		System.out.println(b);
		
		String x = "Hello";
		String y = "Hello";
		String z = "java";
		String d = new String("Hello");
		String e = new String("java");
		String f = new String("java");
		
		System.out.println(x == y);
		System.out.println(x == d);
		
		System.out.println(f == e);
		System.out.println(f == z);
	}
}
