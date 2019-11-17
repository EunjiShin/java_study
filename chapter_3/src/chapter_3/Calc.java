package chapter_3;

public class Calc {
	// main에서 사용자가 입력한 여러개의 실수를 전달받아 합을 구하는 프로그램 
	
	public static void main (String[] args) {
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++) // 넘겨받은 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산
	
		System.out.println("합계 :" + sum);
		// 합산 출력 
	}
}

/*
 * main()은 자바 응용 프로그램의 실행 시작 메소드.
 * main 메소드의 매개변수로 명령행 인자를 전달할 수 있다. 
 * 이클립스에서 run configurations 항목에서 인자를 나열하여 실행하거나,
 * java Calc 3.4 56.7 처럼 인자를 함께 전달해주면 된다.
 * 
 * 
 */