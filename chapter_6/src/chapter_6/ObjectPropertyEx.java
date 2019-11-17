package chapter_6;

//객체의 클래스명, 해시코드값, 문자열을 출력해보는 예제 

class Point2 { 
int x, y;
public Point2(int x, int y) {
this.x = x; this.y = y; }
}


public class ObjectPropertyEx {
	public static void main(String [] args) {
		Point2 p = new Point2(2,3); System.out.println(p.getClass().getName()); 
		//클래스 이름 
		System.out.println(p.hashCode()); 
		// 해시 코드 값 - 16진수로, 실행할 때 마다 달라질 수 있다 
		System.out.println(p.toString()); 
		// 객체의 문자열
		}
}
