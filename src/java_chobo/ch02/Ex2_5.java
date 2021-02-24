package java_chobo.ch02;

public class Ex2_5 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		expression(x, y);
		expression(3, 3);

		String str = ""; // 빈 문자열 <> null
		char ch = ' '; // 빈 문자는 허용하지 않음. blank로 변수 ch를 초기화

		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println("7" + 7);
		System.out.println(7 + 10 + "5");
	}

	private static void expression(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		System.out.printf("%d - %d = %d%n", x, y, x - y);
		System.out.printf("%d * %d = %d%n", x, y, x * y);
		System.out.printf("%d / %d = %d%n", x, y, x / y);
	}

}
