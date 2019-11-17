package chapter_3;
import java.util.Scanner;

public class WhileSample {
//while문을 사용, 정수를 여러개 입력받고 평균을 구해 출력하는 프로그램 
// 만약 -1을 입력하면 프로그램을 종료한다 
	
	public static void main(String[] args) {
		
		int count=0; 
		// 입력된 정수의 개수를 세는 count 변수 
		int sum=0; 
		// 입력된 정수의 합을 저장할 sum 변수
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		int n = scanner.nextInt(); // 정수 입력
		while(n != -1) { // -1이 입력되면 while 문을 종료한다 
			sum += n; // 누적합 저장 
			count++; // count를 증가 - 입력된 정수 개수 증가 
			n = scanner.nextInt(); // 정수 입력
		}
		
		if(count == 0) System.out.println("입력된 수가 없습니다.");
		// count가 0이라면 입력된 수가 없는 것으로 간주 
		
		else { // 아니라
			
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
			// 정수의 개수와 평균 출력 
			// 평균은 누적합 sum을 입력한 정수의 개수 count로 나누어서 구한다 
		}
		scanner.close();
	}

	
}
