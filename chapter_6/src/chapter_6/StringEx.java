package chapter_6;

// String을 활용해 문자열을 다루는 예제 
public class StringEx {
	
	public static void main(String[] args) {
		
		String a = new String(" C#"); 
		String b = new String(",C++ ");
		System.out.println(a + "의 길이는 " + a.length()); 
		// 문자열의 길이 출력 
		System.out.println(a.contains("#")); 
		// 문자열의 포함 관계 - #을 포함하고 있는지? 
		
		a = a.concat(b); // 문자열을 연결한다 
		System.out.println(a);
		
		a = a.trim(); // 문자열 앞 뒤의 공백을 제거한다 
		System.out.println(a);

		a = a.replace("C#","Java"); // c# 문자열을 java 문자열로 대치한다 
		System.out.println(a);
		
		String s[] = a.split(","); // 문자열을 , 기준으로 분리한다 
		for (int i=0; i<s.length; i++)			
		  System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5); // 인덱스 5부터 끝까지 부분문자열을 리턴한다 
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴 
		System.out.println(c); 
		}
}
