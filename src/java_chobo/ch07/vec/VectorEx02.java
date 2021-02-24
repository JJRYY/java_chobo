package java_chobo.ch07.vec;

import java.util.Comparator;
import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Student std01 = new Student(1, "이종윤", 90, 80, 70);
		Student std02 = new Student(2, "김상건", 91, 81, 70);
		Student std03 = new Student(3, "임준엽", 92, 82, 70);
		
		Vector<Student> vecStr = new Vector<Student>();
		vecStr.add(std02);
		vecStr.add(std01);
		vecStr.add(std03);
		System.out.println(vecStr);
		System.out.println(vecStr.contains(new Student(2)));
		System.out.println(vecStr.contains(new Student(2, "김상건", 91, 81, 70)));
		System.out.println(vecStr.indexOf(new Student(2)));
		
		int stdIdx = vecStr.indexOf(new Student(3));
		System.out.println(vecStr.get(stdIdx));
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.stdNo - o2.stdNo;
			}
		};
		
		vecStr.sort(c);
		System.out.println("sorted " + vecStr);
		
		Comparator<Student> cKor = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o2.kor - o1.kor;
			}
		};
		
		vecStr.sort(cKor);
		System.out.println("kor sorted " + vecStr);

		
		Vector<String> vec1 = new Vector<>();
		vec1.add("abc");
		vec1.add("def");
		vec1.add("ghi");
		
		boolean isContain = vec1.contains("def");
		int idx = vec1.indexOf("ghi");
		System.out.println(isContain + " : " + idx);
	}
}
