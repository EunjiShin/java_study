package chapter_2;

public class TypeConversion {
	
	// 자동 타입 변환과 강제 타입 변환을 공부하는 예제. 
	
	public static void main(String[] args) {
		
		byte b = 127;
		int i = 100;

		System.out.println(b+i); // 자동 타입 변환 
		System.out.println(10/4); // 자동 타입 변환 
		System.out.println(10.0/4); // 자동 타입 변환 
		
		System.out.println((char)0x12340041); // 강제 타입 변환 
		System.out.println((byte)(b+i)); // 강제 타입 변환 
		System.out.println((int)2.9 + 1.8); // 강제 타입 변환 
		System.out.println((int)(2.9 + 1.8)); // 강제 타입 변환 
		System.out.println((int)2.9 + (int)1.8); // 강제 타입 변환 
	}
}

/*
 * <자동 타입 변환> 
 * 작은 타입은 컴파일러에 의해 큰 타입으로 자동으로 변환된다.
 * 치환문(=)이나 수식 내에서 타입이 일치하지 않을때 발생한다.
 * 
 * <강제 타입 변환>
 * 큰 타입이 작은 타입으로 변하는 등, 자동 타입 변환이 안되는 경우 발생.
 * 개발자가 강제로 타입 변환을 지시해야 하며, 값 손실 우려가 있다.
 * */
