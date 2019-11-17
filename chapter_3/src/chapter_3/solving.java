package chapter_3;
import java.util.Scanner;

public class solving{
	public static void main(String[]args) {
			Calculator test = new Calculator();
			Array array = new Array();
			For test2 = new For();
			test.test();
			array.print();
			test2.test_for();
	
	}
}

class Calculator{
	public void test() {
		int sum = 0, i = 0;
		while(i<100) {
			sum = sum + i;
			i+=2;
		}
		
		System.out.println(sum);
	
		i = 0;
		sum = 0;
		
		do {
			sum += i;
			i+= 2;
		}while(i<100);

		System.out.println(sum);
		
	}
}

class Array{
	public void print() {
		int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		for(int i = 0; i<n.length; i++) {
			for(int j = 0; j<n[i].length; j++) {
				System.out.print(n[i][j] + " " );
			} System.out.println();
			
		}
	}
}

class For{
	public void test_for(){
		
		System.out.print("정수를 입력하세요 << ");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = n; i>0; i--) {
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
	}
}