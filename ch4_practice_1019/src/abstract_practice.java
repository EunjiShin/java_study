import java.util.Scanner;

abstract class Shape{  //abstract 메소드를 하나라도 가진 경우
	public String name;
	public Shape() {}
	public void paint(){
		draw(name);
		}
	abstract public void draw(String name);
	
}


abstract class Mycomponent{     // abstract 메소드 하나도 없지만, abstract 클래로 선언된 경우 
	public String name;
	public void load(String name) {
		this.name = name;
	}
}



// 추상 클래스의 상속 연습

abstract class Circle extends Shape{   //super의 추상메소드를 구현안함 -> 얘도 객체 못만들어  : 단순상
	public void toString(String name){
		this.name = name;
	}
}

class Ret extends Shape{ // 오버라이딩으로 추상메소드 구현하면, 서브는 추상클래스 아님 -> 얘 객체 만들 수 있다 : 구현상
	public void draw(String name) {
		this.name = name;
		System.out.println(name);
	};
}

public class abstract_practice{
	
	public static void main(String[] args) {
		String Name;
		System.out.println("이름을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		Name = scanner.next();
		Ret ret = new Ret();
		
		ret.draw(Name);
	};
	
}
