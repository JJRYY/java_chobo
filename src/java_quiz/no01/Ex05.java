package java_quiz.no01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 5. 3개 정수를 읽어 들인 후 if-else 문을 사용하여 가장 작은 값을 결정하는 프로그램

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int min = 0;

		if (a > b) {
			if (b > c) {
				min = c;
			} else if (b < c) {
				min = b;
			}
		} else if (a < b) {
			if (a < c) {
				min = a;
			} else if (a > c) {
				min = c;
			}
		}
		
		System.out.println("가장 작은 값은 " + min);
	}

}
