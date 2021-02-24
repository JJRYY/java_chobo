package java_chobo.ch06.dto;

public class Student {
	int stdNo;		// 학번
	String name;	// 이름
	int kor;
	int math;
	int eng;
	
	public Student() {
		super();
//		super(); // 생략 가능
	}

	public Student(int stdNo, String name, int kor, int math, int eng) {
		this.stdNo = stdNo;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public double avg() {
		return total()/3d;
	}

	@Override
	public String toString() {
		return String.format("%3d %10s %3d %3d %3d %3d %.1f]", 
				stdNo, name, kor, math, eng, total(), avg());
	}
	
	
	
}
