package java_chobo.ch08.exception_quiz;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요.");
		try {
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		input.close();
	}

}
