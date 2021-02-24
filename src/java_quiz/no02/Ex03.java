package java_quiz.no02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100 + 1);
		System.out.println("1부터 100 사이의 수를 입력하시오.");

		do {
			input = sc.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수를 입력하시오.");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하시오.");
			}
		} while (input != answer);

		System.out.println("정답입니다.");

	}

}
