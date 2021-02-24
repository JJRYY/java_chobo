package java_temp.class_test.sub;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student std1 = new Student("동양서울대학교", "전산정보학과", 20132222); 
		std1.name = "김다정";
		std1.age = 20;
		std1.address = "서울시 관악구";
		
		System.out.println("이름 : " + std1.name);
		System.out.println("나이 : " + std1.age);
		System.out.println("주소 : " + std1.address);
		System.out.println("학교 : " + std1.schName);
		System.out.println("학과 : " + std1.major);
		System.out.println("학번 : " + std1.stdNo);
		System.out.println("-----------------");
		
		double[] s = new double[8];
		
		System.out.println("8학기 학점을 순서대로 입력하세요");
		for(int i = 0; i < s.length; i++) {
			System.out.printf("%d학기 학점 -> ", i+1);
			s[i] = sc.nextDouble();
		}
		Student.score = s;
		Student.average();
		
		System.out.println("-----------------");
		
		System.out.print("8학기 총 평균 평점은 " + Student.average() + "점입니다.");
	}

}
