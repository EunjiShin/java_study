package chapter_2;
import java.util.Scanner;

public class CoffeePrice {
	// switch문을 활용한 예제 프로그램 
	// 커피 메뉴의 가격을 알려준다 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피 드릴까요? ");
		String order = scanner.next();
		// 입력값의 문자열을 order에 저장 
		
		int price=0;
		
		switch (order) { // 입력값 order에 따라 경우를 나눈 switch문 
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
				// 에스프레소, 카푸치노, 카페라떼의 값을 3500원으로 동일 
			case "아메리카노" :
				price = 2000;
				break;
				// 아메리카노의 값을 2000원 
			default:
				System.out.println("메뉴에 없습니다!");
				// 위의 경우에 해당사항이 없다면 경고문 출력 
		}
		if(price != 0)
			System.out.print(order + "는 " + price + "원입니다");
		// 가격 출력
		scanner.close();
	}

}
