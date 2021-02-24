package java_chobo.ch08;

public class ExceptionEx7 {
	public static void main(String[] args) {
		int a = 10;
		try {
//			System.out.println(a/0);
			throw new RuntimeException();
		} catch (ArithmeticException e) { // ArithmeticException e = new RutimeException();
			System.out.println("/ by zero");
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception 처리");
		}
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.err.println("Exception 발생");
		}
		
		
	}
}
