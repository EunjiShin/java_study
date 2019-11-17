package chapter_3;
import java.util.Scanner;

public class DevideByZeroHandling {
	// try-catch문을 이용, 프로그램 실행 중 발생하는 예외를 처리한다.
	// 정수를 0으로 나누는 경우 경고문을 출력하는 나눔 프로그램 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			System.out.print("나뉨수를 입력하시오:"); 
			int dividend = scanner.nextInt(); // 나뉨수 입력
			
			System.out.print("나눗수를 입력하시오:"); 
			int divisor = scanner.nextInt(); // 나눗수 입력
			
			try { // try블럭을 시도한다 
				System.out.println(dividend + "를 "+ divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
				break; // 만약 정상적인 경우, 나눗셈 결과를 출력한 후 프로그램을 종료한다. 
			}
			catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
				// 만약 예외가 발생한다면 catch 블럭을 실행한다. 
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
				// 경고문 출력하고 재입력 받는다. 
			}
		}
		scanner.close();
	}

}
