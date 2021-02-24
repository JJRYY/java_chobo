package java_chobo.ch08;

public class ExceptionEx8_12 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외가 처리되었습니다.");
		}

	} // end of main

//	static void method1() throws Exception {
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			System.out.println("method1 메서드에서 예외가 처리되었습니다.");
//			throw e;
//		}
//
//	} // end of method1
	
	static int method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return 0; // 현재 실행 중인 메서드 종료
		} catch (Exception e) {
			e.printStackTrace();
			return 1; // catch 블럭 내에도 return문 필요
		} finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	} // end of method1

}
