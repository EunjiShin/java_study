package chapter_3;

public class foreachEx {
	// for-each문을 활용하는 예제 프로그램 
	
	enum Week { 월, 화, 수, 목, 금, 토, 일 }
	// 일주일의 각 요일을 저장하는 열거형 변수 week 
	
	public static void main(String[] args) {
		
		int [] n = { 1,2,3,4,5 };
		//1부터 5까지 저장하는 정수형 배열 n 
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		// 과일을 저장하는 문자열 배열 names 

		int sum = 0;
		// 배열 원소의 누적합을 저장하는 변수 
		
		for (int k : n) { // 배열 n의 각 원소마다 접근하면서 배열 끝까지 반복 
			System.out.print(k + " "); // 반복되는 k 값 출력
			sum += k; // 원소의 합 구하기 
		}
		System.out.println("합은 " + sum); //원소의 합 출력 
		
		// 배열 names의 각 원소마다 s로 접근하면서 배열 끝까지 반복 
		for (String s : names) 
			System.out.print(s + " ");
		System.out.println();
		// 배열 names의 모든 원소를 출력 

		// 열거형 변수 week의 값들에 반복적으로 접근한다. 
		for (Week day : Week.values()) 
			System.out.print(day + "요일 "); // week의 모든 원소를 출력 
		System.out.println();
	}


}
