package java_chobo.ch05;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = { 5, 4, 3, 2, 1 };
		System.out.println("정렬 전 - " + Arrays.toString(intArr));
		bubbleSort(intArr);
		System.out.println("정렬 후 - " + Arrays.toString(intArr));
	}

	private static void bubbleSort(int[] intArr) {
		for (int j = 0; j < intArr.length - 1; j++) {

			for (int i = 0; i < intArr.length - 1 - j; i++) {
				if (intArr[i] > intArr[i + 1]) {
					int temp = 0;
					temp = intArr[i];
					intArr[i] = intArr[i + 1];
					intArr[i + 1] = temp;
				}
			}
			
			System.out.println(Arrays.toString(intArr));

		}

	}

}
