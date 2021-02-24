package java_chobo.ch07.singleton;

public class Singleton {
	private static final Singleton instance = new Singleton();

	private Singleton() { // private 생성자
		
	}

	public static Singleton getInstance() {
		return instance;
	}
	
	
}
