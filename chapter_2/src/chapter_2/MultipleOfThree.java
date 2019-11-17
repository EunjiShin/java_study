package chapter_2;
import java.util.Scanner;

public class MultipleOfThree {
	// if-else를 이용, 입력된 수가 3의 배수인지 판단하는 프로그램 
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		// 입력값을 읽는 in 선

		System.out.print("수를 입력하시오: ");
		int number = in.nextInt();
		// 입력값에서 정수값을 number로 저장
		
		if (number % 3 == 0) // number가 3으로 나누어떨어진다면 3의 배수 판정 
			System.out.println("3의 배수입니다.");
		else // 아니라면 3의 배수가 아니다. 
			System.out.println("3의 배수가 아닙니다.");

		in.close();
		// 사용이 끝난 Scanner in 종료.
	}

	
}
