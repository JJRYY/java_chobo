package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 배열의 요소 값의 합계, 평균

		// 랜덤클래스 선언
		Random rnd = new Random(1234567);

		// size가 5인 정수형 배열 선언
		int[] intArr = new int[5];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(20) + 1;
		}

		System.out.println(Arrays.toString(intArr));

		// 1. 배열에 있는 값들의 합을 구하시오.
		int intSum = 0;
		for (int i = 0; i < intArr.length; i++) {
			intSum = intSum + intArr[i];
		}
		System.out.println("배열의 총합 = " + intSum);

		// 2. 배열에 있는 값들의 평균을 구하시오.
		System.out.println("배열의 평균 = " + (double) intSum / intArr.length);

	}

}
