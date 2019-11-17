package chapter_3;

public class ForSample {
	// for 반복문을 활용, 1부터 10까지의 합을 출력하는 프로그램 
	
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			// i가 1에서 시작해서 10이 될때까지 반복한다. 
			
			sum += i;
			// sum은 반복마다 i를 누적해서 더하는 변수.
			
			System.out.print(i); 
			// 더하는 수를 출력.
			
			if(i<=9) // 1~9까지는 '+' 출력한다. 
				System.out.print("+");
			
			else { // i가 10인 경우엔 +를 출력하지 않고 =와 덧셈 결과를 출력한다. 
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}

}
