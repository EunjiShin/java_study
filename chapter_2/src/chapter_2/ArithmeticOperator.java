package chapter_2;
import java.util.Scanner;

public class ArithmeticOperator {
	// 산술 연산을 연습하는 예제
	
	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
//입력값을 읽는 scanner

System.out.print("정수를 입력하세요 : ");
int time = scanner.nextInt();
// 입력값에서 정수를 읽는다 
int second = time % 60;
// 초는 60으로 나눈 나머지  
int minute = (time/60)%60;
// 분은 60으로 나눈 몫을 다시 60으로 나눈 나머지 
int hour = (time/60) / 60;
// 시간은 60으로 나눈 몫을 다시 60으로 나눈 몫 

System.out.print(time + "초는 ");
System.out.print(hour + "시간, ");
System.out.print(minute + "분, ");
System.out.print(second + "초입니다. ");
// 구한 초, 시간, 분을 출력한다.

scanner.close();
// 사용이 끝난 scanner을 종료시킨다.
}
}

