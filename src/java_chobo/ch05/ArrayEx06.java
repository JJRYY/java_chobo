package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx06 {

	public static void main(String[] args) {
//		exam01();

//		exam02();

		String[] strArr = { "전수린", "우정아", "김예진", "이민정" };
		String[] strArr2 = { "김상건", "이나연", "신범건", "정민강" };

		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(strArr2));

//		strArr = strArr2;

		prnString(strArr);

//		System.out.println(Arrays.toString(strArr));
//		System.out.println(Arrays.toString(strArr2));
	}

	private static void prnString(String[] strArr) {
		for (String str : strArr) {		// read만 가능, 수정 불가능
			System.out.println(str);
		}

		int[] intArr = { 5, 4, 3, 2, 1 };
		for (int a : intArr) {			// read만 가능, 수정 불가능
			System.out.println(a);
		}
	}

	public static void exam02() {
		String[] name = { "김경연", "김상건", "김인환" };
		String[] name2 = new String[] { "김경연", "김상건", "김인환" };

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name2));
	}

	public static void exam01() {
		String[] name = new String[3];

		System.out.println(Arrays.toString(name));

		name[0] = new String("김경연");
		name[1] = "김상건";
		name[2] = "김인환";

		System.out.println(Arrays.toString(name));
	}

}
