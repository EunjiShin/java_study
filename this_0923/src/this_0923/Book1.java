package this_0923;

public class Book1 {
/* this 연습*/
		/*
		 * 객체의 멤버 변수과 메소드 변수의 이름이 같은 경우
		 * 다른 메소드 호출 시 객체 자신의 레퍼런스를 전달할 경우
		 * 메소드가 객체 자신의 레퍼런스를 반환할 때 
		 * */
		
		String title;
		String author;
		void show() {System.out.println(title + " " + author);}
		
		public Book1() {
			this("", "");
			System.out.println("생성자 호출");
		}
		
		public Book1(String title) {
			this(title, "작자미상");
		}
		
		public Book1(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public static void main(String [] args) {
			
			Book1 littlePrince = new Book1("어린왕", "생텍쥐페");
			Book1 loveStory = new Book1("춘향");
			Book1 emptyBook = new Book1();
			loveStory.show();
			
			System.out.println("어린왕자의 작가는 : " + littlePrince.author);
			
		
		}
		
		
	}

