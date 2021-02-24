package java_temp;

import java.util.Scanner;

public class RecursiveCall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int a = sc.nextInt();
		long b = factorial(a);
		System.out.println(b);
		
		sc.close();
	}

	private static long factorial(int a) {
		long result = 0;
		if (a==1) {
			result = 1;
		} else {
			result = a * factorial(a-1);
		}
		return result;
	}

}
