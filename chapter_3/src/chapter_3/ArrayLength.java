package chapter_3;
import java.util.Scanner;

public class ArrayLength {
	// 배열 원소의 평균을 구하는 프로그램 
	
	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		// 5칸짜리 정수형 배열 생성 
		int sum = 0;
		// 누적합을 저장하는 변수 
		
	Scanner scanner = new Scanner(System.in);
	System.out.print(intArray.length + "개의 정수를 입력하세요 >> ");
	for(int i=0; i<intArray.length; i++) {
		intArray[i] = scanner.nextInt();
	}
	// 배열의 길이만큼 반복하면서 배열의 칸마다 정수 입력 
	
	
	for(int i=0; i < intArray.length; i++) {
		sum += intArray[i];
		// 배열의 길이만큼 반복하면서 배열의 원소를 누적하여 더한다 
	}
	
	System.out.println("배열의 원소의 합은 "+sum+"입니다.");
	// 배열 원소의 합을 출력 
	System.out.print("평균은" + (double)sum/intArray.length);
	// 누적합을 배열의 길이로 나누어 원소의 평균을 구한다. 
	scanner.close();
	
	}
}

