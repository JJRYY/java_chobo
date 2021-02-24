package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
//		array_01();
		
		char[] chArr = {'a', 'b', 'c', 'd'};
		System.out.println(Arrays.toString(chArr));
		prnChArr(chArr);
		
	}

	private static void prnChArr(char[] chArr) {
		System.out.println("method-start");
		
		for (int i = 0; i < chArr.length ; i++) {
			System.out.printf("[%c] ", chArr[i]);
		}
		System.out.println();
		System.out.println("method-end");
		
	}

	public static void array_01() {
		// 배열
		int[] score = new int[5];
		System.out.println("main-start");
		System.out.println(Arrays.toString(score));

		prnArr(score);
		
		score[0] = 10;
		System.out.println(Arrays.toString(score));
		prnArr(score);
		
		System.out.println(Arrays.toString(score));
		System.out.println("main-end");
	}

	private static void prnArr(int[] arr) {
		System.out.println("prnArr()-start");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d  ", arr[i]);
		}
		System.out.println();
		
		arr[4] = 100;
		System.out.println("prnArr()-end");

	}

}
