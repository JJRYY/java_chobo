package java_chobo.ch05;

public class Q05_04 {

	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				total = total + arr[row][col];
			}
		}
		
		average = total / (float) (arr.length * arr[0].length);
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);

	}

}
