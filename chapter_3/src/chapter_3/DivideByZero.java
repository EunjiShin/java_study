package chapter_3;
import java.util.Scanner;

public class DivideByZero {
	// 두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수 - 나누어지는 수 
		int divisor; // 나눗수 - 나누는 수 
		
		System.out.print("나뉨수를 입력하시오:"); 
		dividend = scanner.nextInt(); // 나뉨수 입력
		
		System.out.print("나눗수를 입력하시오:"); 
		divisor = scanner.nextInt(); // 나눗수 입력
		
		System.out.println(dividend+"를 "+ divisor + "로 나누면 몫은 " + 
				dividend/divisor + "입니다.");
		scanner.close();
	}

}

// 0으로 나누면 예외 발생으로 프로그램이 강제종료된다. 