package chapter_4;

public class Book {
// 생성자 연습 예제 
// 저자와 제목을 필드로 갖는 Book 클래스 
	String title; // 제목 필드 
	String author; // 저자 필드 
	
	public Book(String t) { // 매개변수를 하나 가지는 생성자
		title = t; author = "작자미상";
		// 매개변수로 제목 초기화, 저자는 '작자미상'으로 초기화 
	}
	
	public Book(String t, String a) { // 매개변수를 둘 가지는 생성자 
		title = t; author = a;
		// 전달받은 매개변수로 제목과 저자를 초기화 
	}
	
	public static void main(String [] args) {
		
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); 
		// 매개변수를 둘 전달한 경우 - 제목은 어린왕자, 저자는 생텍쥐페리가 된다 
		Book loveStory = new Book("춘향전"); 
		// 매개변수를 하나 전달한 경우 - 제목은 춘향전, 저자는 작자미상이 된다 
		System.out.println(littlePrince.title + " " + littlePrince.author);
		// 어린왕자의 제목과 저자를 출력 
		System.out.println(loveStory.title + " " + loveStory.author);
		// 춘향전의 제목과 저자를 출력 
	}
}

/*<생성자의 특징>
 * 1. 생성자는 메소드이며, 클래스 이름과 반드시 동일해야 한다 
 * 2. 생성자는 오버로딩이 가능하다 
 * 3. 생성자는 new를 통해 객체를 생성할 때 객체당 한번 호출되며, 목적은 객체의 초기화이다.
 * 4. 생성자는 리턴 타입을 지정할 수 없다
 * 5. 생성자는 객체가 생성될 때 반드시 호출되어야 하므로, 하나 이상 선언되어야 한다. 
 * 만약 없을 경우, 컴파일러가 자동으로 기본 생성자를 삽입한다. 
 * 
 * 
 * -> 기본생성자 
 * : 매개변수 없고 아무 작업없이 단순 리턴하는 생성자로, 디폴트 생성자라고도 한다.
 * 만약 개발자가 하나라도 생성자를 작성한 경우, 기본생성자는 자동생성되지 않는다. 
 * */


