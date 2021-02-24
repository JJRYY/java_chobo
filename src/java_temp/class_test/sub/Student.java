package java_temp.class_test.sub;

public class Student extends Person {
	String schName;
	String major;
	int stdNo;
	static double[] score = new double[8];
	
	public Student(String schName, String major, int stdNo) {
		this.schName = schName;
		this.major = major;
		this.stdNo = stdNo;
	}
	
	static double average() {
		double sum = 0;
		double average = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return average = sum / score.length;

	}
	
	
}
