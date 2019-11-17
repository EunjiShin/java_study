package chapter_2;

public class BitOperator { 
	// 비트 논리 연산과 비트 시프트 연산을 연습하는 예제 
	
	public static void main(String[] args) {
		short a = (short)0x55ff; 
		short b = (short)0x00ff;

		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT

		byte c = 20; // 0x14
		byte d = -8; // 0xf8

		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c <<2); // c를 2비트 왼쪽 시프트
		System.out.println(c >>2); // c를 2비트 오른쪽 시프트. 0 삽입
		System.out.println(d >>2); // d를 2비트 오른쪽 시프트. 1 삽입
		System.out.printf("%x\n", (d >>>2)); // d를 2비트 오른쪽 시프트. 0 삽입
	}
}


// 결과값 왜 이렇게 나오는지?
/* 
2진수에서 음수를 표현하는 법
 2 : 0000 0010
-2 : 2의 보수로 표현. 1111 1110

음수와 양수 시프트 연산 실행 값 추론 연습 
(논리적 시프트 / 산술적 시프트 )
 */