package java_quiz.no02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		exam01();
		exam02(sc);
		exam03(sc);

		sc.close();

	}

	public static void exam03(Scanner sc) {
		int input = 0;
		int sum = 0;
		do {
			System.out.println("정수를 입력하세요. (0을 입력시 종료)");
			input = sc.nextInt();
			sum = sum + input;
		} while (input != 0);
		System.out.println("총 합은 " + sum);
	}

	public static void exam02(Scanner sc) {
		int sum = 0;
		int j = 0;
		System.out.println("정수의 개수를 입력하세요.");
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			j = sc.nextInt();
			sum = sum + j;
		}
		System.out.println("정수의 총합은 " + sum);
	}

	public static void exam01() {
		int sum = 0;

		for (int i = 0; i < 101; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}

}
