package java_chobo.ch08;

public class ExceptionEx11 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		int[] arr2 = null; 
		
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(arr2[0]);
		System.out.println(arr[arr.length]);
		System.out.println(0/0);
		System.out.println(4);
		} 
		/*
		 * catch (ArithmeticException e) { 
		 * e.printStackTrace();
		 * System.out.println(e.getMessage());
		 * System.err.println("ArithmeticException 처리"); 
		 * }
		 */
		  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 초과");
		
		} catch (Exception e) {
			e.printStackTrace();
//			if (e instanceof ArrayIndexOutOfBoundsException) {
//				System.out.println("배열의 인덱스 범위를 초과");
		} finally {
			// resource 자원
			System.out.println("finally");
		}
		
		System.out.println(7);
	}

}
