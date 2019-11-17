package chapter_3;

// for 반복문을 연습한다 
public class ForOperator {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=100; i++) { 
			sum += i; // 100까지의 모든 홀수를 더한다 
			System.out.print(i); // 더하는 수 출력

			if(i<100) 
				System.out.print("+"); // 만약 100 이전의 수는 +를 출력하지만 
			else { // 아니라면 =와 결과를 출력한다 
				System.out.print("\n="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}
}
