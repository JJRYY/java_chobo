package java_quiz.no02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		do {
			System.out.println("4자리 정수를 입력하시오.");
			input = sc.nextInt();
			a = input % 10;
			b = (input / 10) % 10;
			c = (input / 100) % 10;
			d = input / 1000;
		} while (input < 0);
		System.out.printf("%d%d%d%d", a, b, c, d);
	}

}
