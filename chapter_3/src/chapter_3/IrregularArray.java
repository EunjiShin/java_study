package chapter_3;

public class IrregularArray {
	// 비정방형 배열 - 값 초기화 & 출력 프로그램 
	
	public static void main (String[] args) {
		
		int intArray[][] = new int[4][]; // 행이 4개인 비정방형 배열 선언 
		intArray[0] = new int[3]; // 0번째 행의 열은 3개 
		intArray[1] = new int[2]; // 1번째 행의 열은 2개 
		intArray[2] = new int[3]; // 2번째 행의 열은 3개 
		intArray[3] = new int[2]; // 3번째 행의 열은 2개 
		

		for (int i = 0; i < intArray.length; i++) // 배열의 각 행마다 반복 
			for (int j = 0; j < intArray[i].length; j++) // 각 행의 열마다 반복  
				intArray[i][j] = (i+1)*10 + j; // 원소 값 저장 

		for (int i = 0; i < intArray.length; i++) { // 각 행마다 반복 
			for (int j = 0; j < intArray[i].length; j++) // 각 열마다 반복 
				System.out.print(intArray[i][j]+" "); // 원소 출력 
			System.out.println();
		}
	}
}


/*
 * 배열의 종류 
 * 1. 정방형 배열 - 직사각형 배열이라고도 함.
 * 행마다 열의 개수가 일정.
 * 
 * 2. 비정방형 배열 - 톱니바퀴형 배열이라고도 함.
 * 행마다 열의 개수가 다름. 

 *
 * */
