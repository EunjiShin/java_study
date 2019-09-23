import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); // 키보드에서 정수 입력
			if(n % 2 == 0) 
				continue; 
			else 
				sum += n; 
		}
		System.out.println("홀수의 합  " + sum);
		
		scanner.close();
	}
}
