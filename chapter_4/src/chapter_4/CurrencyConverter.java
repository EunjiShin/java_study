package chapter_4;
import java.util.Scanner;

// static멤버를 활용해 달러와 원화를 변환해주는 환율 계산기 예제 프로그램 

class StaticMember{
	private static double rate; // 한국 원화 
	public static double toDollar(double won) { // 원화 받아
		return won/rate; // 환율 - 달러로 변환 
	}
	
	public static double toKRW(double dollar)
	{return dollar*rate; }  // 달러를 받아서 - 한국 원화로 변환
	
	public static void setRate(double r) {
		rate = r; // 환율 설정  
	}
}

public class CurrencyConverter{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 환율을 입력하고 -> 한국 원화를 받아서 달러로 변환 / 달러를 받아서 원화로 변환
		System.out.print("환율(1달러) : ");
		double rate = scanner.nextDouble();
		StaticMember.setRate(rate); // 환율 설정하고
		
		System.out.println("백만원은 달러로 " + StaticMember.toDollar(1000000) + "달러 입니다.");
		System.out.println("$100은 원화로" + StaticMember.toKRW(100) + "원 입니다.");
	
		scanner.close();
		
	}
}