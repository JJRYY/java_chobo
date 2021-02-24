package java_chobo.ch07.vec;

public class Student {
	int stdNo;		// 학번
	String name;	// 이름
	int kor;
	int math;
	int eng;
	
	public Student(int stdNo) {
		this.stdNo = stdNo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stdNo;
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		Student other = (Student) obj;
//		if (stdNo != other.stdNo)
//			return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if (stdNo == other.stdNo)
				return true;
		}
		return false;
	}
	
}
