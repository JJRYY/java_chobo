package java_quiz.no01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 4. 카우프 지수 = 체중(kg)/[키(cm)]^2
		//           저체중     표준체중    과체중       비만
		//    20 대	17.9이하	18~23	24~30	30초과
		//    30 대	18.4이하	18.5~24	25~30	30초과
		
		Scanner sc = new Scanner(System.in);
		System.out.println("체중(kg)을 입력하세요.");
		double a = sc.nextDouble();
		System.out.println("키(cm)를 입력하세요.");
		double b = sc.nextDouble();
		System.out.println("나이 : 1. 20대, 2. 30대");
		int age = sc.nextInt();
		
		double kaup = a / ((b/100) * (b/100));
		
		System.out.println("카우프 지수 => " + kaup);
		
		if (age == 1) {
			if (kaup<18) {
				System.out.println("저체중입니다.");
			} else if (kaup<24) {
				System.out.println("표준체중입니다.");
			} else if (kaup<=30) {
				System.out.println("과체중입니다.");
			} else {
				System.out.println("비만입니다.");
			}
			
		} else {
			if (kaup<18.5) {
				System.out.println("저체중입니다.");
			} else if (kaup<25) {
				System.out.println("표준체중입니다.");
			} else if (kaup<=30) {
				System.out.println("과체중입니다.");
			} else {
				System.out.println("비만입니다.");
			}
			
		}
		
				
	}

}
