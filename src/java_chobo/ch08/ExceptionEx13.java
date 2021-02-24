package java_chobo.ch08;

public class ExceptionEx13 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void method1() {
		method2();
		
	}

	private static void method2() {
		throw new RuntimeException("런타임 익셉션 발생");
		
	}

}
