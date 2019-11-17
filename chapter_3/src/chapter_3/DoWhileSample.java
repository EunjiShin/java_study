package chapter_3;

public class DoWhileSample {
	// do-while문을 이용, 알파벳 a부터 z까지를 출력하는 프로그램 
	
	public static void main (String[] args) {
		char c = 'a';
		// 알파벳을 출력하기 위한 변수 
		int count = 0;
		// 알파벳의 총 개수를 확인하기 위한 변수 
		
		do {
			System.out.print(c); // a부터 시작 - 알파벳을 출력한다 
			c = (char) (c + 1); // 출력 후, 다음 알파벳으로 넘어간다 
			count++; // 알파벳의 개수를 세기 위해 count를 증가시킨다 
		} while (c <= 'z'); 	 // 만약 변수 c가 'z'가 된다면 종료한다. 
		
		System.out.print('\n');
		System.out.print(count); // 알파벳의 개수 출력 
	}
	

}
