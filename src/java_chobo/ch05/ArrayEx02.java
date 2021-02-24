package java_chobo.ch05;

import java.util.*;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		
		Random rnd = new Random();
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(45)+1;
		}
		System.out.println(Arrays.toString(intArr));
		
	}

}
