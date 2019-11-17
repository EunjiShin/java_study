package chapter_3;

public class NumException {
	// 정수가 아닌 문자열을 정수로 변환할 때 예외를 처리하는 프로그램 
	
	public static void main (String[] args) {
		
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		// 문자열 배열 stringNumber 
		
		int i=0;
		// 반복에 활용할 변수 i 
		try {
			for (i=0; i<stringNumber.length; i++) { // 배열 길이만큼 반복 
				int j = Integer.parseInt(stringNumber[i]);
				// 문자열을 정수로 변환 후 저장 
				System.out.println("숫자로 변환된 값은 " + j);
				// 정수로 변환된 문자열 출력 
			}
		}
		catch (NumberFormatException e) {
			// 만약 정수로 변환할 수 없는 경우의 예외 
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}

}
