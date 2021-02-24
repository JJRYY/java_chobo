package java_chobo.ch06;

class Variable{
	int iv;				// 인스턴스 변수
	static int CV;		// 클래스 변수(공유 변수)
	
	void method() {
		int lv = 0;		// { } 안에 선언한 변수 -> 지역변수
	}
}

public class Ex06_05 {

	public static void main(String[] args) {
		Variable.CV = 10;
		System.out.println("Variable.CV " + Variable.CV);
	
		Variable v1 = new Variable();
		v1.iv = 5;
		System.out.println("iv " + v1.iv);
		System.out.println("CV " + v1.CV);
		
		Variable v2 = new Variable();
		v2.iv = 7;
		System.out.println("iv " + v2.iv);
		System.out.println("CV " + v2.CV);
		
		v2.CV = 20;		// 클래스변수는 공유된다.
		System.out.println("v1.CV " + v1.CV);
		System.out.println("v2.CV " + v2.CV);
		
		// 클래스변수는 클래스명.클래스변수(대문자) 로 하는게 좋다.
		// ex) Variable.CV
		Variable.CV = 30;
		System.out.println("Variable.CV " + Variable.CV);
		System.out.println("Variable.CV " + Variable.CV);
	}
	
	

}
