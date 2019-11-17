package chapter_4;

public class ArrayParameterEx {
	// 인자로 배열이 전달되는 예제 
	
	static void replaceSpace(char a[]) {
		// 배열을 인자로 전달받아, 
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ') // 만약 배열 중 공백이 있다면 
				a[i] = ','; // ','으로 대치한다 
	}
	
	static void printCharArray(char a[]) {
		// 인자로 넘겨받은 배열을 출력하는 메소드 
		for (int i = 0; i < a.length; i++)
			// 배열 길이만큼 반복 
			System.out.print(a[i]);
		// 배열 원소를 출력 
		System.out.println();
	}
	public static void main (String args[]) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		// 문자형 배열 초기화 
		printCharArray(c);
		// 배열 원본 출력 
		replaceSpace(c);
		// 배열 대치 메소드 호출 
		printCharArray(c);
		// 대치된 배열 출력 
	}

}


/* <자바의 인자 전달 방식>
 * 1. 기본타입(primitive type)의 값 전달
 * : 값이 복사되어 전달된다 
 * : 메소드의 매개변수가 변경되어도 호출한 실인자 값은 변경되지 않는다. 
 * 
 * 
 * 2. 객체혹은 배열 전달 
 * : 메소드의 매개변수와 호출한 실인자 객체나 배열을 공유한다. 
 * : 객체가 전달되는 경우와 동일하다. 
 * 
 * 
 * */
