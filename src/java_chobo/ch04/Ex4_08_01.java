package java_chobo.ch04;

public class Ex4_08_01 {

	public static void main(String[] args) {

		for (int j = 1; j < 10; j++) {

			for (int i = 2; i < 10; i++) {
				System.out.printf("%d * %d = %d 	", i, j, i * j);
			}
			
			System.out.println();
		}
	}

}
