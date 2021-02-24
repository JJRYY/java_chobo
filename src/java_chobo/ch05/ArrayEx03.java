package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = { 5, 4 };
		System.out.println(Arrays.toString(intArr));
		// intArr[0]과 intArr[1]의 값을 교환
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		System.out.println(Arrays.toString(intArr));
	}

}
