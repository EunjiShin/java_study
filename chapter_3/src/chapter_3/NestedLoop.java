package chapter_3;

public class NestedLoop {
	// 2중 중첩 for 반복문을 이용, 구구단을 출력하는 프로그램 
	
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) { // 1단에서 9단까지 반복 
			
			for(int j=1; j<10; j++) { // 각 단의 구구셈 출력
				
				System.out.print(j + "*" + i + "=" + i*j); 
				// 각 단의 곱셈결과를 차례로 계산.
				// 모든 단의 1, 모든 단의 2, ....로 각 단이 세로로 출력되게 한다 
				System.out.print('\t'); 
				// 가독성을 위해 한 탭씩 띄운다 
				
			}
			System.out.println(); // 한 단이 끝나면 다음 줄로 이동해, 다음 곱셈을 출력한다.
		}
	}


}
