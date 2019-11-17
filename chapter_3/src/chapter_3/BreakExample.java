package chapter_3;
import java.util.Scanner;

public class BreakExample {
	// break문을 이용한 예제 
	// exit이 입력되면 while문을 빠져나가도록 break를 활용한다 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) { // 무한반복
			
			System.out.print(">>");
			String text = scanner.nextLine();
			// 입력값에서 문자열을 저장한다 
			
			if(text.equals("exit")) // exit이 입력되면 반복을 종료한다 
				break; // while 문 탈출 
		}
		System.out.println("종료합니다.");
		// 반복이 끝나면 종료합니다 경고문을 출력. 
		scanner.close();
	}

}
