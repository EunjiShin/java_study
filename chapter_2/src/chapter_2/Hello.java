package chapter_2;

// 예제 2-1 : 자바프로그램의 기본 구조 

public class Hello { // Hello 이름의 클래스를 선언한다. 
	
	public static int sum(int n, int m) {
		// sum 메소드 
		return n + m; // 매개변수 n+m을 반환 
	}

	public static void main(String[] args){ 
		// main 메소드 - 실행 시작. String[] args 로 실행 인자를 전달받는다.
		int i = 20;
		int s;
		char a;

		s = sum(i, 10); // sum 메소드를 호출한다. 
		a = '?';
		System.out.println(a); // 문자 ?를 화면에 출력한다 
		System.out.println("Hello"); // Hello 문자열을 화면에 출력한다 
		System.out.println(s); // 변수 s의 값을 화면에 출력한다 
	
}

}


/*
 * 자바에서의 식별자
 *  
 * (사용가능) 
 * _, $, 숫자, 한글 이름사용가능
 * 길이 제한 없음
 * 대소문자 구별
 * 
 * (잘못된 예)
 * 첫 문자로 숫자 사용 불가
 * 예약어 사용 불가
 * false, null 사용 불가
 * %는 특수문자 취
 *  */
