package chapter_3;

public class ReturnArray {
	// 일차원 배열을 생성, 초기화한 후, 배열을 리턴하는 메소드를 작성하고, 
	// 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램 
	
	static int[] makeArray() { 
		// 일차원 배열을 생성한 후 반환하는 메소드 
		
		int temp[] = new int[4]; 
		// 4칸짜리 정수형 일차원 배열 생성
		for (int i=0; i<temp.length; i++) // 배열의 각 원소에 접근 
			temp[i] = i; // 배열의 원소 초기
		return temp; // 배열 반환 
	}

	public static void main (String[] args) {
		int intArray[]; // 배열 레퍼런스 변수 선언
		intArray = makeArray(); // 메소드로부터 배열을 전달받는다 
		for (int i=0; i<intArray.length; i++) //배열의 원소마다 접근 
			System.out.print(intArray[i] + " "); // 배열 모든 원소 출력
	}


}
