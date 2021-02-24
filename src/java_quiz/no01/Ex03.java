package java_quiz.no01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 3. 놀이공원 입장료를 계산하는 프로그램
		//    야간 5시 이후, 소인(3~12세/65세 이상)
		//    자유이용권 주간 대인 34,000, 소인 25,000
		//            야간 대인 29,000, 소인 21,000
		//       입장권 주간 대인 27,000, 소인 20,000
		//            야간 대인 23,000, 소인 17,000
		//    자유이용권인지 입장권인지 질문한 후, 사용자의 나이, 현재시각을 입력받아 지불 요금 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 자유이용권, 2. 입장권");
		int ticket = sc.nextInt();
		System.out.println("나이를 입력하세요. - 3세부터 입장가능");
		int age = sc.nextInt();
		System.out.println("현재 시각(분은 생략)을 입력하세요. - 운영시간은 9시~21시");
		int time = sc.nextInt();
		
		if (ticket == 1) {
			if (time >= 9) {
				if(time < 17) {
					if (age >= 3) {
						if (age <= 12) {
							System.out.println("25,000원");
						} else if (age < 65) {
							System.out.println("34,000원");
						} else if (age >= 65) {
							System.out.println("25,000원");
						}
					} else {
						System.out.println("3세 미만 입장불가");
					}
				} else if (time < 21) {
					if (age >= 3) {
						if (age <= 12) {
							System.out.println("21,000원");
						} else if (age < 65) {
							System.out.println("29,000원");
						} else if (age >= 65) {
							System.out.println("21,000원");
						}
					} else {
						System.out.println("3세 미만 입장불가");
					}
				} else {
					System.out.println("운영시간이 아닙니다.");
				} 
			} else {
				System.out.println("운영시간이 아닙니다.");
			}
		} else if (ticket == 2) {
			if (time >= 9) {
				if(time < 17) {
					if (age >= 3) {
						if (age <= 12) {
							System.out.println("20,000원");
						} else if (age < 65) {
							System.out.println("27,000원");
						} else if (age >= 65) {
							System.out.println("20,000원");
						}
					} else {
						System.out.println("3세 미만 입장불가");
					} 
				} else if (time < 21) {
					if (age >= 3) {
						if (age <= 12) {
							System.out.println("17,000원");
						} else if (age < 65) {
							System.out.println("23,000원");
						} else if (age >= 65) {
							System.out.println("17,000원");
						}
					} else {
						System.out.println("3세 미만 입장불가");
					} 
				} else {
					System.out.println("운영시간이 아닙니다.");
				}
			} else {
				System.out.println("운영시간이 아닙니다.");
			}
		}
		
		
	}

}
