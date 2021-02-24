package java_chobo.ch04;

public class Ex4_11 {

	public static void main(String[] args) {
//		exam01();

		// for
//		exam02();

		// while
		exam03();

	}

	public static void exam03() {
		int row = 0;
		while (row < 10) {
			int col = 0;
			while (col < 10) {
				System.out.print("*");
				col++;
			}
		row++;
		System.out.println();
		}
	}

	public static void exam02() {
		for (int row = 0; row < 10; row++) {

			for (int col = 0; col < 10; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exam01() {
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
	}

}
