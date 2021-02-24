package java_chobo.ch06;

import java_chobo.ch06.dto.Student;

public class Exam06_03 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student(1, "이민정", 99, 98, 97);
		
		System.out.println(std1);
		System.out.println(std2);
	}

}
