public class Book{
	String title;
	String author;
	void show() {System.out.println(title+" "+author);
	
	public Book() {
		this("", "");
		System.out.println("생성자 호출");
	}
	
	public Book(String title) {
		this(title, "작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args) {
		Book littlePrince = new Book("어린왕", "생텍쥐페");
		Book loveStory = new Book("춘향");
		Book emptyBook = new Book();
		loveStory.show();
	}
	}
	
}