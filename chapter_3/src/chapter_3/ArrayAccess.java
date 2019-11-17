package chapter_3;
import java.util.Scanner;

public class ArrayAccess {
	// 양수 5개를 입력받아 배열에 저장한 후, 최소값을 출력하는 프로그램 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5]; 
		// 정수형 5칸짜리 배열 생성 

		int min =0; 		
		// 최소값을 저장할 변수 
		
		System.out.println("양수 5개를 입력하세요.");	
		
		for(int i=0; i<5; i++) {
			// 배열의 처음부터 끝까지 반복 
			intArray[i] = scanner.nextInt(); 
			
			if(i==0) {
			min = intArray[0];
			//배열의 맨 처음 값을 최소값으로 초기 설정 
			}
			
			if(intArray[i] < min) 
				min = intArray[i]; 
			// 최소값 구하기 
		}
		System.out.print("가장 작은 수는 " + min + "입니다.");
		// 최소값 출력 
		
		scanner.close();
 	}                                                                                                                                                                                                                                                                                                                   
}


