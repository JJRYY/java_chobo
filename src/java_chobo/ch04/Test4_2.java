package java_chobo.ch04;

public class Test4_2 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0) {
				continue;
			} else if (i % 3 == 0) {
				continue;
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
