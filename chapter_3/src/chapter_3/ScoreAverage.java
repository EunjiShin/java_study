package chapter_3;

public class ScoreAverage {
	// 2차원 배열을 이용, 각 학년마다 1, 2학기 성적을 저장하고, 4년간 전체 평점의 평균을 구한다. 
	
	public static void main(String[] args) {
		
		double score[][] = {{3.3, 3.4},		// 1학년 1, 2학기 평점
							{3.5, 3.6},		// 2학년 1, 2학기 평점
							{3.7, 4.0},		// 3학년 1, 2학기 평점
							{4.1, 4.2} };	// 4학년 1, 2학기 평점
		// 각 학년마다 1, 2학기 평점을 저장하는 2차원 배열 score 
		
		double sum=0;
		// 각 학년마다 성적을 저장하는 변수 
		
		for(int year=0; year<score.length; year++) // 배열의 길이만큼 반복 -  각 학년별로 반복
			for(int term=0; term<score[year].length; term++) // 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점의 합을 구한다. 
		// length는 배열의 행으로 접근한다. 
		
		int n=score.length; // 배열의 행 개수, 4
		int m=score[0].length; // 배열의 열 개수, 2
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
		// 2차원 배열의 원소 개수는 배열의 행 x 배열의 열 이므로, 전체 평점의 합 sum을 n*m으로 나누어 평균을 구한다. 
	}

}
