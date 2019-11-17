package chapter_2;
import java.util.Scanner;

// 입력한 금액을 지폐와 동전으로 바꿔주는 프로그램 연습 
public class test{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int money;
	int a,b,c,d;
	
	System.out.print("정수를 입력하세요.");
	money = scanner.nextInt();
	
	
		a = money / 50000; // a는 50000원권 지폐의 개수 
		money = money - a*50000; // 남은 금액 계산 
		
		b = money / 10000; // b는 만원 지폐 개수
		money = money - b*10000; // 남은 금액 계산 
		
		c = money / 1000; // c는 1000원 지폐 개수 
		money = money - c*1000; // 남은 금액 계산 
		
		d= money / 500; // d는 500원 개수 
		money = money - d*500; // 남은 금액계산 
		
	
		
		System.out.println("오만원권" +a+"장");
		System.out.println("만원권" +b+"장");
		System.out.println("천원권"+c+"장");
		System.out.println("오백원"+d+"개");
		
	}
		
	
}
