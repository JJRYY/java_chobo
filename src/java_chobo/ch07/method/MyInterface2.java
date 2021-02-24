package java_chobo.ch07.method;

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}
