package chapter_3;
import java.util.Scanner;

public class ContinueExample {
	//continue를 이용, 홀수의 합을 구하는 프로그램.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		// 누적합을 저장하는 변수 sum 
		int count =0;
		// 홀수 개수를 셀 변수 count 
		
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); // 키보드에서 정수 입력
			if(n % 2 == 0) // 짝수라면 넘어간다 
				continue; 
			else  // 홀수라면 더한다 
				count++; // 홀수 개수 세고 
				sum += n; 
		}
		System.out.println("홀수의 합  " + sum);
		//합 출력 
		System.out.println("홀수의 개수  " + count);
		
		scanner.close();
	}
}
