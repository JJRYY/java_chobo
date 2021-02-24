package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		String[] strArr = {"a", "b"};
		String[] str = null;
		System.out.println(Arrays.toString(str));	// null
		str = strArr;
		System.out.println(Arrays.toString(str)); 	// "a","b"
		
		prnStr(strArr);
	}

	private static void prnStr(String[] strArr) {
		String str = "abcdef";
		String str1 = str.substring(3);
		String str2 = str.substring(3, 4);
		
		System.out.println(str1);
		System.out.println(str2);
	
		char[] chArr = str.toCharArray();
		for(char ch : chArr) {
			System.out.println(ch);
		}
	}

}
