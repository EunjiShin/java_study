package chapter_6;
// wrapper 클래스를 활용하는 예제 
// wrapper 클래스 : 자바의 기본타입들을 클래스화한 8개의 클래스
// : 객체만 사용할 수 있는 컬렉션 등에 기본 타입 값을 사용하기 위해 사용한다 

public class wrapper_practice{
	public static void main(String[]args) {
		
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
	
		if(Character.isDigit(c1)) // c1이 숫자라면 true 
			System.out.println(c1 + "는 숫자 ");
		// 숫자임을 출력 
		
		if(Character.isAlphabetic(c2)) // c2가 알파벳이면 true 
			System.out.println(c2 + "는 알파벳");
		// 알파벳임을 출력 
		
		System.out.println(Integer.parseInt("28")); // 정수로변환 
		System.out.println(Integer.toString(28)); // 문자열로 변환 
		System.out.println(Integer.toBinaryString(28)); // 이진수롤 변환 
		System.out.println(Integer.bitCount(28)); // 이진수 표현에서 1의 개수 반환 
		
		Integer i = new Integer(28); // Integer 객체 생성 
		System.out.println(i.doubleValue()); 
		
		Double d = new Double(3.14); // Double 객체 생성 
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3); // boolean 변수 생성 
		System.out.println(Boolean.toString(b)); // 문자열로 변환 
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 false로 변환 
	}
}