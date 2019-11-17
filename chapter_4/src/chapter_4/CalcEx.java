package chapter_4;

// static 멤버에 대해 알아보는 예제 

class Calc {
	// static 메소드를 가지는 클래스 Calc 
	
	public static int abs(int a) { return a>0?a:-a; }
	public static int max(int a, int b) { return (a>b)?a:b; }
	public static int min(int a, int b) { return (a>b)?b:a; }
}


public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
		// 모두 정상 실행 된다. static이 전역으로 동작하기 때문 
	}

}


/*<static의 활용>
 * 1. 전역 변수와 전역 함수를 만들 때 활용
 * : static으로 클래스에 작성하면 전역 변수 / 전역 함수로 동작한다. 
 * 
 * 2. 공유 멤버를 작성할 때 
 * : static 필드나 메소드는 하나만 생성해도 된다. 클래스의 객체들이 공유하기 때문 
 * 
 * 단, static에서는 non-static에 접근할 수 없으나, non-static에선 static에 접근할 수있다. 
 * non-static은 static 시점에서 아직 생성 안 되었을 수 있지만, 반대의 경우는 
 * 항상 가능하기 때문이다. 
 * 
 * */
