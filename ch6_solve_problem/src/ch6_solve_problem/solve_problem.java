package ch6_solve_problem;

public class solve_problem {
	public static void main(String[]args) {
		String a = "가나다라";
		System.out.println(a == "가나다라");
		String b = new String(a);
		
		System.out.println(a == b);
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
