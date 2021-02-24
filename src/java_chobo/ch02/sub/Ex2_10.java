package java_chobo.ch02.sub;

import java.util.Scanner;

// 자동 import ctrl+shift+o
public class Ex2_10 {

	public static void main(String[] args) {
		// 키보드로부터 입력을 받는 클래스 Scanner

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수를 입력하세요. ");
//		int num = sc.nextInt();
//		System.out.println("num = " + num);
		
		System.out.println("문자를 입력하세요. ");
		String resStr = sc.nextLine(); // "1000" 숫자 입력시 문자열 처리
		
		int num = Integer.parseInt(resStr); // "1000" -> 1000
		System.out.println("resStr = " + num);
		
		sc.close();

//		Ex2_9.varPrint();
	}

}













