import java.util.Scanner;

interface PhoneInterface { // 인터페이스 선언
	 final int TIMEOUT = 10000; // 상수 필드 선언
	 void sendCall(); // 추상 메소드
	 void receiveCall(); // 추상 메소드
	 private void hehe() {
	  System.out.println("hehe"); 
	 }
	 default void printLogo() { // default 메소드
	  System.out.println("** Phone **");
	  hehe();
	 }
	}


public class triangle{
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int medium;
		int a, b, c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		if((a > b)&&(b>c)) medium = a;
		else if((a > b)&&(c>b)&&(a>c)) medium = c;
		else if((a > b)&&(c>b)&&(a<c)) medium = a;
		else if((a<b)&&(b<c)) medium = b;
		else if((a<b)&&(c<b)&&(a<c)) medium = c;
		else medium = a;
			
		System.out.print(medium);
			
		}
	
}