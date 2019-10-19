import java.util.Scanner;

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