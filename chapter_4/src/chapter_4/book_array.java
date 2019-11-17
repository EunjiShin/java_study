package chapter_4;
import java.util.Scanner;


// 객체 배열 응용 예제 2 

class Book_3{
	
	String title, author; // 제목과 저자를 멤버로 갖는 클래스 선언 
	
	public Book_3(String title, String author) { 
		// 매개변수로 제목과 저자를 초기화하는 생성자 
		this.title = title;
		this.author = author;
	}
}

public class book_array {
	
	public static void main(String[] args) {
		Book_3 [] book = new Book_3[2]; 
		// Book_3 객체 배열 생성 

		System.out.print("예제 4-7 \n");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			// 제목과 저자를 입력받은 후, 
			book[i] = new Book_3(title, author); // 배열 원소 객체 생성
			// 매개변수로 전달하여 객체 생성 
		}

		for(int i=0; i<book.length; i++) // 배열의 원소마다 접근하면서 
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		// 제목과 저자 출력 
		scanner.close();
	}
}