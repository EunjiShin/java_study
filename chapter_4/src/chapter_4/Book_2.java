package chapter_4;

// this를 이용해 생성자를 수정한 예제 프로그램

public class Book_2 {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	// 각 객체의 제목과 저자를 출력하는 메소드 

	public Book_2() {
		this("", ""); // 매개변수가 없는 경우, this를 이용, 다른 생성자를 호출한다 
		System.out.println("생성자 호출됨");
	}

	public Book_2(String title) { // 매개변수가 하나인 경우 
		this(title, "작자미상"); // this를 이용, 전달받는 매개변수를 다른 생성자로 전달하며 호출한다. 
	}

	public Book_2(String title, String author) {
		// 매개변수가 둘인 생성자 
		this.title = title; this.author = author;
		// 제목과 저자를 this 포인터를 이용해 초기화한다. 
	}
	public static void main(String [] args) {
		
		Book_2 littlePrince = new Book_2("어린왕자", "생텍쥐페리");
		Book_2 loveStory = new Book_2("춘향전");
		Book_2 emptyBook = new Book_2();		
		loveStory.show();
	}


}

/*
 * this()
 * : 클래스 내의 다른 생성자를 호출한다. 
 * 생성자 내에서만 사용가능하며, 반드시 생성자 코드의 제일 처음에 수행해야한다. 
 * 
 * this 레퍼런스
 * : 객체 자신에 대한 레퍼런스. 컴파일러에 의해 자동으로 관리된다.
 * this.멤버 형태로 멤버를 사용한다 
 * 
 * */
