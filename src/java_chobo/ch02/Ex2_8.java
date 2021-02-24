package java_chobo.ch02;

public class Ex2_8 {

	public static void main(String[] args) {
		// 두 변수를 교환
		int x = 10;
		int y = 5;
		System.out.println("x = " + x + ", y = " + y);

		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x + ", y = " + y);
	}

}
