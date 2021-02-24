package java_temp;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		factorial(sc);
//		decTobin(sc);
		
		// 재귀함수 (recursive call)
		int res = fact(5);
		System.out.println("5! = " + res);
		
		
		
		sc.close();
		
	}

	private static int fact(int n) {
		// 종료조건 반드시 존재
		if (n == 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}

	private static void decTobin(Scanner sc) {
		System.out.println("십진수를 입력(0~255 사이의 정수를 입력)");
		int num = sc.nextInt();
		
		int[] binArr = new int[8];
		for (int i = binArr.length-1; i >= 0; i--) {
			binArr[i] = num % 2;
			num = num / 2;
		}
		for (int j = 0; j < binArr.length; j++) {
			System.out.print(binArr[j]);
		}
		
	}

	public static void factorial(Scanner sc) {

		System.out.println("팩토리얼을 입력");
		int num = sc.nextInt();
		long fact = 1L;
		
		for (int i = num; i > 0; i--) {
			fact =  i * fact;
		}
		
		System.out.println(num + "! = " + fact);
	}

}
