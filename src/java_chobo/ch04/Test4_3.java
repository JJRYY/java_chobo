package java_chobo.ch04;

public class Test4_3 {

	public static void main(String[] args) {

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < 11; i++) {
			sum = sum + i;
			sum1 = sum1 + sum;
//			System.out.printf("%d	", sum);
		}
//		System.out.println();
		System.out.printf("%d	", sum1);

	}

}
