package chapter_2;
import java.util.Scanner;

public class Nestedlf {
	// 중첩 if-else문을 이용, 점수와 학년을 입력받아 합격, 불합격을 판단하는 프로그램 
	// 4학년의 경우, 70점 이상이어야 합격한다 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); 
		// 입력값의 정수를 score에 저장 

		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt(); 
		// 입력값의 정수를 year에 저장 

		if(score >= 60) { // 점수가 60점 이상이라면 
			if(year != 4)
				System.out.println("합격!"); // 4학년 아니면 합격 출력 
			else if(score >= 70)
				System.out.println("합격!"); // 4학년이 70점 이상이면 합격 출력 
		else
			System.out.println("불합격!"); // 4학년이 70점 미만이면 불합격 출
		}
		else // 점수가 60점 미만이라면 불합격 
			System.out.println("불합격!");

		scanner.close();
	}
}
