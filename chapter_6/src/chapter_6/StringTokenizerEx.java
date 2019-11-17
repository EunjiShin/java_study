package chapter_6;
import java.util.StringTokenizer; 

// StringTokenizer을 이용한 문자열 분리 예제 
public class StringTokenizerEx {
	
	public static void main(String[] args) {
	String query = "name=kitae&addr=seoul&age=21"; 
	StringTokenizer st = new StringTokenizer(query, "&");
	// & 기준으로 문자열을 분리한다 
	int n = st.countTokens(); // 분리된 토큰 개수를 저장한다 
	System.out.println("토큰 개수 = " + n); // 토큰 개수 출력 
	
		while(st.hasMoreTokens()){ 
			// 토큰이 아직 더 있다면 
			String token = st.nextToken();
			// 다음 토큰을 저장하고 
			System.out.println(token);
			// 출력한다 
				}
	} 
}

