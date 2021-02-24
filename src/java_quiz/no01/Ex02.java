package java_quiz.no01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 2. 사용자로부터 하나의 문자를 입력받음.
		//    입력받은 문자가 대문자이면 소문자로 변환, 소문자이면 대문자를 입력하라는 메시지를 출력.
		//    'A'를 빼고 'a'를 더해주면 소문자로 변환된다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요.");
		char ch = sc.next().charAt(0);
		
		if (65 <= ch && ch <= 90) {
			ch = (char) (ch + 32);
			System.out.printf("%c%n", ch);
		} else {
			System.out.println("대문자를 입력하세요.");
		}
		
	}

}
