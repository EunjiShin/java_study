package chapter_3;

public class ArrayException {
// try-catch문 응용 : 배열의 인덱스가 범위를 벗어날 경우의 예외 처리 프로그램 
	
	public static void main (String[] args) {
		
		int[] intArray = new int[5];
		// 5칸짜리 정수형 배열 선언
		
		intArray[0] = 0;
		// 배열의 첫 원소를 0으로 초기화 
		
		try {
			for (int i=0; i<5; i++) { // 배열의 각 원소에 접근 
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]);
				// 실행 중 예외가 없다면, try 블럭 처리. 
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// try블럭 실행 시도에서 예외가 발생한다면 catch 블럭 처리 
			// 배열 인덱스 범위를 벗어난 경우 
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
			// 경고문 출력 
		}
	}

	
}




/*<자바의 예외 클래스>
 * ArthmeticException : 정수를 0으로 나눌 때 발생
 * NullPointerException : null 레퍼런스를 참조할 경우 발생 
 * ClassCastException : 변환할 수 없는 타입으로 객체 변환할 때 발생 
 * OutOfMemoryError : 메모리가 부족한 경우 발생 
 * ArrayIndexOutOfBoundsException : 배열의 범위를 벗어난 접근 시 발생 
 * IllegalArgumentException : 잘못된 인자 전달 시 발생 
 * IOException : 입출력 동작 실패 또는 인터럽트시 발생 
 * NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생 
 * InputMismatchException : 본래 의도와 어긋나는 입력의 경우 발생 
 * */
