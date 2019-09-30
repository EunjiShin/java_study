class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void Print_weight() {
		System.out.print("몸무게 : "+this.weight);
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
	height = 175;
	// weight = 99; private니까 접근 안되는게 당
	setWeight(99); //private 멤버는 public 메소드 이용해서 접근하
	
	System.out.print("이름 : "+this.name );
	System.out.print("나이 : "+this.age );
	System.out.print("키 : "+this.height);

	}
}

public class IngeritanceEx{
	public static void main(String [] args) {
		Student s = new Student();
		s.set();
		s.Print_weight();
	
	}
}