//추상 메소드 : 선언되어 있으나 구현은 안됨. abstract로 선언. 서브 클래스에서 오버라이딩해서 구
//추상 클래스 : 1. 추상 메소드를 하나라도 가진 클래스 (abstract 반드시 써준다) 2. 추상 메소드가 하나도 없지만 abstract로 선언된 클래스.

abstract class Calculator {
public abstract int add(int a, int b);
public abstract int subtract(int a, int b);
public abstract double average(int[] a);
}

class GoodCalc extends Calculator {
	@Override
	public int add(int a, int b) { // 추상 메소드 구현
		return a + b;
	}
	@Override
	public int subtract(int a, int b) { // 추상 메소드 구현
		return a - b;
	}
	@Override
	public double average(int[] a) { // 추상 메소드 구현
		double sum = 0;
		for (int i = 0; i <a.length; i++)
			sum += a[i];
		return sum/a.length;
	}

	public static void main(String [] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] { 2,3,4 }));
	}
}
