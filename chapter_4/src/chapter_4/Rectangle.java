package chapter_4;
import java.util.Scanner;

public class Rectangle {
	// 너비와 높이를 멤버로 갖는 Rectangle 클래스 생성 
	int width;
	int height;

	public int getArea() { // 사각형의 면적을 구하는 메소드 
		return width*height;
	}

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(); // Rectangle 객체 rect 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");

		rect.width = scanner.nextInt(); // 너비 입력받기 
		rect.height = scanner.nextInt(); // 높이 입력받기 

		System.out.println("사각형의 면적은 " + rect.getArea());
		// 메소드를 이용, 객체의 면적 구한 후 출력 

		scanner.close();
	}
}
