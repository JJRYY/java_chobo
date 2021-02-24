package java_chobo.ch03;

import java.util.Scanner;

public class Ex3_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 두 점수를 입력 받아서 크기 비교
//		exam01(sc);

		// 정수를 입력받아서 60점 이상이면 '합격' 그렇지 않으면 '불합격'이 출력되도록 작성하시오.
//		examScore(sc);

		// 정수를 입력받아서 90점 이상이면 "수", 80점 이상이면 "우", 70점 이상이면 "미",
		// 60점 이상이면 "양", 그 외 "가" 가 출력 되도록 하시오.(삼항연산자)
//		exam03(sc);

		// 정수를 입력받아서 90점 이상이면 "수", 80점 이상이면 "우", 70점 이상이면 "미",
		// 60점 이상이면 "양", 그 외 "가" 가 출력 되도록 하시오.(if)
		// 학생 20명을 입력받아서 결과를 출력 (반복문 추가)
		exam05(sc);
		
		sc.close();
	}

	public static void exam05(Scanner sc) {
		System.out.println("학생 수를 입력하세요.");
		int cnt = sc.nextInt();
		for(int i = 0; i < cnt; i++) {
			exam04(sc);
		}
	}

	public static void exam03(Scanner sc) {
		System.out.println("점수를 입력하시오.");
		int a = sc.nextInt();
		String result = (a >= 90) ? "수" : ((a >= 80) ? "우" : ((a >= 70 ? "미" : ((a >= 60 ? "양" : "가")))));
		System.out.println(result);
	}

	public static void exam04(Scanner sc) {
		System.out.println("점수를 입력하시오.");
		int a = sc.nextInt();
		String result = null;
		if (a >= 90) {
			result = "수";
		} else if (a >= 80) {
			result = "우";
		} else if (a >= 70) {
			result = "미";
		} else if (a >= 60) {
			result = "양";
		} else {
			result = "가";
		}
		System.out.println(result);
	}



	public static void examScore(Scanner sc) {
		System.out.println("점수를 입력하시오.");
		int a = sc.nextInt();
		String score = (a >= 60) ? "합격" : "불합격";

		System.out.println(score);
	}

	public static void exam01(Scanner sc) {
		System.out.println("두 개의 정수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = (a > b) ? a : b;
		System.out.println(max);

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
	}

}
