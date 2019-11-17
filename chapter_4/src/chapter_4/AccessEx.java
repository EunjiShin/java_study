package chapter_4;
//접근지정자를 알아보기 위한 예제 

class Sample {
	public int a; // 외부에서 접근가능한 멤버 a 
	private int b; // 외부에서 접근 불가능한 멤버 b 
	int c; // 디폴트 접근지정자 - public이 되는 멤버 c 
}


public class AccessEx {
	
	public static void main(String[] args) {
		Sample aClass = new Sample();
		// Sample 클래스의 객체 aClass 생성 
		aClass.a = 10;
		aClass.b = 10;
		// private 멤버라 접근될 수 없다 
		aClass.c = 10;
	}

}
