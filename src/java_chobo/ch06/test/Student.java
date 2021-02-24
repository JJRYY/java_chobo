package java_chobo.ch06.test;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {
	
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f",
							name, ban, no, kor, eng, math, kor+eng+math, (kor+eng+math)/3f);
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		String res = String.format("%.1f", getTotal()/3.0f);
//		return Float.parseFloat(res);
		return Float.parseFloat(String.format("%.1f", getTotal()/3.0f));
	}

	@Override
	public String toString() {
		return String.format("이름=%s, 반=%d, 번호=%d, 국어=%d, 영어=%d, 수학=%d%n총점=%d, 평균=%.1f", 
				name, ban, no, kor, eng, math, getTotal(), getAverage());
	}

	
	
	
}
