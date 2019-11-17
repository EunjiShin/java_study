package chapter_2;
import java.util.Scanner;
// Scanner 사용을 위해 import 해준

public class ScannerEx {
	// Scanner를 이용해 키 입력을 연습한다.
	
	public static void main(String args[]) { 
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in); 
		// Scanner 사용을 위해 입력값을 저장하는 scanner 선언해준다. 
		
		String name = scanner.next(); 
		// 입력값에서 문자열을 읽는다.
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		// 입력값에서 문자열을 읽는다.
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); 
		// 입력값에서 정수값을 읽다. 
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble(); 
		// 입력값에서 double형 실수를 읽는다. 
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean(); 
		// 입력값에서 boolean(논리값)을 읽는다. 
		System.out.println("독신 여부는 " + single + "입니다.");
		
		scanner.close(); 
		//사용이 끝나면, scanner을 닫는다.
	}

}
