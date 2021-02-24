package java_chobo.ch05;

import java.util.Arrays;

/**
 * Arrays 클래스
 *
 */
public class ArrayEx14 {

	public static void main(String[] args) {
		// 배열이 같은지 비교
		int[] intArr1 = {1,2,3,4};
		int[] intArr2 = {1,2,3,4};
		System.out.println(Arrays.equals(intArr1, intArr2));
		System.out.println(Arrays.toString(intArr1));
		
		int[][] int2Arr1 = {{1, 2}, {2, 3, 5}};
		int[][] int2Arr2 = {{1, 2, 4}, {2, 3, 5}};
		System.out.println(Arrays.deepEquals(int2Arr1, int2Arr2));
		System.out.println(Arrays.deepToString(int2Arr1));
		
		// 배열의 복사
		String[] strArr = {"전수린", "우정아"};
		String[] copyArr = Arrays.copyOf(strArr, strArr.length);
		System.out.println(Arrays.toString(copyArr));
		
		String[] strArr2 = {"김상건", "이나연", "신범건", "정민강", "김재룡", "임준엽"};
		String[] copyArr2 = Arrays.copyOfRange(strArr2, 2, 5);
		System.out.println(Arrays.toString(copyArr2));
		
		String[] copyArr3 = new String[5];
		System.out.println(Arrays.toString(copyArr3));
		System.arraycopy(strArr, 0, copyArr3, 1, strArr.length);
		System.out.println(Arrays.toString(copyArr3));
		
		
		// 배열의 정렬
		int[] intArr3 = {5,4,3,2,1};
		Arrays.sort(intArr3);
		System.out.println(Arrays.toString(intArr3));
		
		System.out.println(Arrays.binarySearch(intArr3, 6));
	}

}
