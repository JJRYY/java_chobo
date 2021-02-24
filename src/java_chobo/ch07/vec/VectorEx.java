package java_chobo.ch07.vec;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vec1 = new Vector<>();
		
		for (int i = 0; i < 5; i++) {
		vec1.add("test" + i);
		}
		
		System.out.println(vec1);
		System.out.println(vec1.size());
		
		vec1.remove(3);
		System.out.println(vec1);
		System.out.println(vec1.size());

		System.out.println(vec1.get(0));
		
		int idx = vec1.indexOf("test4");
		System.out.println("idx = " + idx);
	}

}
