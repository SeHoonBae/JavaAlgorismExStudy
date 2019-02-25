package JavaAlgorismExStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OverlapFor {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		q1();
		q2();
		q3(reader);
	}

	/* 3.
	 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.

	한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
	
	출력
	입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
	 */
	private static void q3(BufferedReader reader) throws Exception {
		
		String N;
		int start=0;
		// 입력하는 단어가 1~100자 내외가 아닌경우 다시 입력하게 함
		do {
		System.out.print("영대소문자로 이루어진 단어를 입력하세요 (1~100자 내외) : ");
		N = reader.readLine();
		}while(N.length() < 1 || N.length() > 100);
		
		// 단어를 열개씩 끊기 위한 구문, 단어의 길이를 10으로 나누면 해당 단어 길이를 열개씩 끊을 때 몇개까지 끊어야 될지 알 수 있음
		for(int i = 0; i < N.length() / 10; i++ ) {
			System.out.println(N.substring(start, start+10));
			start += 10;
		}
		// 단어를 열개씩 출력하고 열개가 안되는 나머지를 출력
		System.out.println(N.substring(start, N.length()));
		
	}

	/* 2.
	 * 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
	 */
	private static void q2() {
		//첫번째 주사위
		int x;
		//두번째 주사위
		int y;
		// 두 주사위 눈의 합
		int sum = 6;
		
		// 첫번째 주사위가 1~6까지 나오는 경우
		for(x = 1; x <= 6; x++) {
			// 두번째 주사위가 1~6까지 나오는 경우
			for( y = 1; y <= 6; y++) {
				// 첫번째 주사위와 두번째 주사위의 합이 sum 값이 되는 경우 출력
				if(x + y == sum) System.out.printf("첫번째 주사위 : %d, 두번째 주사위 : %d \n",x,y);
				else continue;
			}
		}
		
		
	}

	
	/* 1.
	 * 1에서 100까지의 정수 중에서 2, 3, 5, 7의 배수를 제외한 수를 출력

	 */
	private static void q1() {
		
		// 출력할 때 십의 자리수가 뭔지 알기 위한 수
		int k=0;
		
		// 1~100까지 정수를 비교하는 for문
		for(int i = 1; i <= 100; i++) {
			
			// 보기 편하게 1~9, 10~19, 20~29 ... 으로 나눠서 출력하도록 만듬
			if(i / 10 != k) { 
				System.out.println();
				k++;
			}
			
			// 2,3,5,7의 배수일 경우 출력하지 않고 그외의 수일 때 출력
			if(i % 2 == 0 || i % 3 == 0 || i % 5 ==0 || i % 7 ==0) continue;
			else System.out.print(i+"\t");
			
		}
	}
	
	
}
