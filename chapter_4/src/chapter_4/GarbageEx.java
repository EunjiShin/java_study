package chapter_4;

public class GarbageEx {
	// 가비지가 언제 발생하는지 알아보는 예제 
	public static void main(String[] args) {
		
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		
		a = null; 
		d = c;
		c = null;
		// a, c 둘다 null을 가리키지만 d가 c가 가리키던 메모리 가리키므로, 결국 가비지는 
		// a가 가리키던 'Good'이 된다. 
		
		System.out.println(a);
		System.out.println(d);
	}

}

/*<자바에서 객체의 소멸과 가비지 컬렉션>
 * 객체 소멸 - 자바 응용프로그램에서 객체 소멸은 개발자가 아닌, 자바 가상 기계의 역할.
 * 가리키는 레퍼런스가 하나도 없는 객체를 가비지라고 하며, 
 * 자바 가상기계의 가비지 컬렉터가 자동으로 가비지를 수집, 반환하는 것을 '가비지 컬렉션' 이라고 함.
 * System.gc()로 가빕지 컬렉션 작동을 요청할 수 있지만, 결국 jvm이 컬렉션 시점을 판단한다. 
 */