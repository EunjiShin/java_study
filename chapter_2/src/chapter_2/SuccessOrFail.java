package chapter_2;
import java.util.Scanner;

public class SuccessOrFail {
	//if문을 사용하는 예제
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 입력값을 읽는 scanner 
		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		// 입력값의 정수를 score로 저장 
		
		if (score >= 80) // score이 80 이상이라면 합격 
			System.out.println("축하합니다! 합격입니다.");
		else // 아니라면 불합격 
			System.out.println("불합격입니다.");
		

		scanner.close();
		// 사용이 끝나면 scanner 종료 
	}
}
