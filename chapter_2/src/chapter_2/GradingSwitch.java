package chapter_2;
import java.util.Scanner;


public class GradingSwitch {
	// 다중 if-else문을 switch문을 이용해 간단하게 바꾼 예제 
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		// 입력값의 정수를 score에 저장
	
		switch (score/10) { // score을 10으로 나눈 몫에 따라 결과를 달리하는 switch문
		
			case 10: // score = 100
				
			case 9: // score는 90~99
				grade = 'A';
				break;
				
			case 8: // score는 80~89
				grade = 'B';
				break;
				
			case 7: // score는 70~79
				grade = 'C';
				break;
				
			case 6: // score는 60~69
				grade = 'D';
				break;
				
			default: // score는 59 이하
				grade = 'F';
		}
		System.out.println("학점은 "+grade+"입니다");
		// grade를 출력 
		scanner.close();
	}
}
