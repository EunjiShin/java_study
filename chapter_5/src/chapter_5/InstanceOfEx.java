package chapter_5;

//instanceof 연산자를 활용한 예제 
// 각 상속관계에 따라 레퍼런스가 가리키는 객체의 타입이 무엇인지 알아본다 

class Human { }
class student_2 extends Human { }
class Researcher extends Human { }
class Professor extends Researcher { }

public class InstanceOfEx {
	
	static void print(Human p) {
		if(p instanceof Human)
			System.out.print("Human ");
		
		if(p instanceof student_2)
			System.out.print("student ");
		
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		
		if(p instanceof Professor)
			System.out.print("Professor ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); print(new student_2());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
	}
}


/*<instanceof 연산자, 객체의 타입 판단>
 * 업캐스팅된 경우 -> 객체의 타입 판단이 어렵다 
 * : instanceof 연산자로 레퍼런스가 가리키는 객체의 타입을 알 수 있다. 
 * : true/false 의 boolean 값으로 결과 출력 
 * */

