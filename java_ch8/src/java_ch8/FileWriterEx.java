package java_ch8;
import java.io.*; 
import java.util.*;


public class FileWriterEx {
	public static void main(String[] args) { 
		// 파일 입출력 - 키보드 입력을 파일로 저장하기 
		Scanner scanner = new Scanner(System.in); 
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("‎⁨Macintosh HD⁩\\사용자⁩\\user⁩\\⁨데스크탑⁩");
			// test.txt 에 입력받을것 
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0) {break;}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류 ");
		}
		scanner.close();
	}
}
