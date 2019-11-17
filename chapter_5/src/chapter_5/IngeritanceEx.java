package chapter_5;
// 상속을 이용하는 예제 

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	// 몸무게, 나이, 키, 이름을 멤버로 갖는다 
	// 몸무게는 외부에서 접근하지 못하게한다 
	
	public void setWeight(int weight) { // 몸무게를 초기화한다 
		this.weight = weight;
	}
	
	public void Print_weight() { // 몸무게를 출력한다 
		System.out.print("몸무게 : "+this.weight);
	}
	public int getWeight() {
		// 몸무게를 리턴한다 
		return weight;
	}
}

class Student extends Person{
	// person을 상속받는 student 클래스 
	public void set() {
		// 이름, 나이, 키를 초기화한다 
		age = 30;
		name = "홍길동";
	height = 175;
	// weight = 99; private니까 접근 할 수 없다. 
	setWeight(99); //private 멤버는 public 메소드 이용해서 접근한다. 
	
	System.out.print("이름 : "+this.name );
	System.out.print("나이 : "+this.age );
	System.out.print("키 : "+this.height);
	// 이름, 키, 나이를 출력한다 

	}
}

public class IngeritanceEx{
	public static void main(String [] args) {
		Student s = new Student();
		//Student 클래스의 s 객체 생성 
		s.set(); // 초기화 
		s.Print_weight(); // 몸무게 출력 
	
	}
}