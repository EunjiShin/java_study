package chapter_2;
import java.util.Scanner;

public class LogicalOperator{
	// 비교 연산자와 논리 연산자를 연습하는 예제 
	
	public static void main(String[] args) {
		
		// 비교 연산 
		// 두 피연산자를 비교해 true 또는 false의 논리 값을 낸다. 
		System.out.println('a' > 'b');
		System.out.println(-3 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		
		// 논리 연산 
		// 논리값으로 NOT, OR, AND, XOR 논리를 연산한다. 
		// !은 NOT, ||는 OR, &&는 AND, ^는 XOR 연산을 나타낸다. 
		System.out.println((3>2) && (3>4));
		System.out.println((3!=2) || (3>4));
		System.out.println((3>2) ^ (3>4));
	}
} 