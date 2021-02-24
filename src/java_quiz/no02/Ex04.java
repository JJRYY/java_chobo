package java_quiz.no02;

public class Ex04 {

	public static void main(String[] args) {

//		exam01();

//		exam02();

		exam03();

	}

	public static void exam03() {
		for (int i = 0; i < 7; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exam02() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exam01() {
		for (int i = 0; i < 7; i++) {
			System.out.println("*******");
		}
	}

}
