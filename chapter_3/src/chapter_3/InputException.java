package chapter_3;
import java.util.Scanner;
import java.util.InputMismatchException; 
// 입력오류 예외를 처리하기 위해 import 

public class InputException {
	// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 예외처리 프로그램 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		
		int sum=0, n=0;
		// sum은 누적합, n은 정수 입력 
		
		for(int i=0; i<3; i++) { // 반복해서 정수 입력 
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) { // 만약 정수가 아닌 수 입력시 
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소시킨 후 
				continue; // 다음 루프로 넘어간다 
			}
			sum += n; // 합하기
		}
		System.out.println("합은 " + sum);
		// 합을 출력 
		scanner.close();
}


}
