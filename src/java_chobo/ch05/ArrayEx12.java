package java_chobo.ch05;

/**
 * 가변배열
 *
 */
public class ArrayEx12 {

	public static void main(String[] args) {
		int[][] intArr = {
				{1, 2},
				{3, 4, 5, 6},
				{4, 5, 6}
		};
		
		int[][] intArr2 = new int[3][];
		intArr2[0] = new int[2]; 
		intArr2[1] = new int[] {9, 10, 11, 12}; 
		intArr2[2] = new int[] {9, 10, 12}; 
				
		prnArr(intArr);
		System.out.println();
		prnArr(intArr2);
	}

	private static void prnArr(int[][] intArr) {
		for(int row = 0; row < intArr.length; row++) {
			for(int col = 0; col < intArr[row].length; col++) {
				System.out.printf("%d ", intArr[row][col]);
			}
			System.out.println();
		}
		
	}

}
