package java_chobo.ch07.singleton;

public class Main {

	public static void main(String[] args) {
//		Singleton st = new 
		UnSingleton us1 = new UnSingleton();
		UnSingleton us2 = new UnSingleton();
		
		System.out.println(us1);
		System.out.println(us2);
		
		Singleton si1 = Singleton.getInstance();
		Singleton si2 = Singleton.getInstance();
		
		System.out.println(si1);
		System.out.println(si2);
		
	}

}
