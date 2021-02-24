package java_chobo.ch09;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		
		int a = i; // auto unboxing
		
		Integer i2 = 100; // auto boxing
		
		System.out.println(a);
		System.out.println(i2);

	}

}
