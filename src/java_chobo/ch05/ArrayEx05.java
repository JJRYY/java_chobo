package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 선형검색
		int[] intArr = { 9, 10, 23, 15, 4, 3, 1, 2, 99, 100 };
		
		System.out.println(Arrays.toString(intArr));
		
		int searchKey = 2;
		int find = linearSearch(intArr, searchKey);
		System.out.printf("선형 검색 : intArr에서 %d를 검색한 결과 intArr[%d]에 위치함%n", searchKey, find);
		int find2 = binarySearch(intArr, searchKey);
		System.out.printf("이분 검색 : intArr에서 %d를 검색한 결과 intArr[%d]에 위치함", searchKey, find2);
	}

	private static int binarySearch(int[] intArr, int searchKey) {
		// 1. 정렬
		for (int j = 0; j < intArr.length - 1; j++) {
			for (int i = 0; i < intArr.length - 1 - j; i++) {
				if (intArr[i] > intArr[i + 1]) {
					int temp = 0;
					temp = intArr[i];
					intArr[i] = intArr[i + 1];
					intArr[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(intArr));
			
		// 2. 검색
		int left = 0;
		int right = intArr.length-1;
		int mid;
		for( ; left <= right ; ) {
			mid = (left + right)/2;
			System.out.printf("left %d right %d mid %d searchKey %d%n", left, right, mid, searchKey);
			if (intArr[mid] == searchKey) {
				return mid;
			} else if (intArr[mid] > searchKey) {
				right = mid - 1;
			} else if (intArr[mid] < searchKey) {
				left = mid + 1;
			} 
		}
		return -1;
		
	}

	private static int linearSearch(int[] intArr, int searchKey) {
		int idx = -1;
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] == searchKey) {
				idx = i;
				break;
			} 
		}
		return idx;
	}

}
