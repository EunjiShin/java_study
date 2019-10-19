import java.util.StringTokenizer;
import java.util.Random;

public class practice_String {

	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append(" World");
		sb.replace(6, 15 , "everybody");
		sb.insert(15, "!");
		System.out.println(sb);
		
		// StringTokenizer
		
		String query = "name&age&height";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int count = st.countTokens();
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println("토큰 개수 : " + count);
		
		for(int x=0; x<3; x++) {
			int n = (int)(Math.random()*100+1); // 100 ~ 1의 난수 발생
			System.out.println(n);
		}
		
		Random r = new Random();
		int n = r.nextInt(); // 자바 정수 범위에서 난수 
		int m = r.nextInt(100); // 0 - 99범위에서난수 
		
		System.out.println(n);
		System.out.println(m);
		
		System.out.println(Math.abs(-3.14)); // 절대값
		System.out.println(Math.sqrt(4.0)); // 제곱
		System.out.println(Math.exp(2)); // e^2 
		System.out.println(Math.round(3.14)); // 반올림 
		
		System.out.println("이번주 행운의 번호 ");
		for(int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random()*40+1));
		}
		
	}
}




