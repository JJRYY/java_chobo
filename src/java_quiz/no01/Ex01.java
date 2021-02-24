package java_quiz.no01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1. 상점에서 하나에 100원인 물건을 판매. 물건을 10개 이상은 10%, 20개 이상은 15%, 100개 이상은 20% 할인

		Scanner sc = new Scanner(System.in);

		System.out.println("판매 개수를 입력하세요.");
		int i = sc.nextInt();
		int total = 0;

		if (i < 10) {
			total = 100 * i;
		} else if (i < 20) {
			total = 100 * i * 90 / 100;
		} else if (i < 100) {
			total = 100 * i * 85 / 100;
		} else if (i >= 100) {
			total = 100 * i * 80 / 100;
		}
		
		System.out.println("총 판매액은 " + total +"원 입니다.");
	}

}
