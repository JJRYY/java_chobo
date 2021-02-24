package java_chobo.ch05;

/**
 * 가변 인수
 *
 */
public class ArrayEx13 {

	public static void main(String[] args) {
		int kor = 100;
		int eng = 90;
		int math = 80;
		
		int soc = 80;
		
		sum(kor, eng, math);
		
		가변배열(kor, eng, math, soc);
		가변배열(kor, eng);
		가변배열2("신범건", 90, 90, 90);
	}

	private static void 가변배열2(String name, int...i) {
		System.out.println("name " + name);
		System.out.println(i.length);
		
	}

	private static void 가변배열(int...jumsu) {	// new int[4]
		System.out.println(jumsu.length);
	}

	private static void sum(int kor, int eng, int math) {
		
		System.out.println(kor + eng + math);
	}

}
