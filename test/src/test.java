import java.util.Scanner;

public class test{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int money;
	int a,b,c,d;
	
	System.out.print("정수를 입력하세요.");
	money = scanner.nextInt();
	
	
		a = money / 50000;
		money = money - a*50000;
		
		b = money / 10000;
		money = money - b*10000;
		
		c = money / 1000;
		money = money - c*1000;
		
		d= money / 500;
		money = money - d*500;
		
	
		
		System.out.println("오만원권" +a+"장");
		System.out.println("만원권" +b+"장");
		System.out.println("천원권"+c+"장");
		System.out.println("오백원"+d+"개");
		
	}
		
	
}
