package java_temp;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] students = new Student[5];
		initial(students);
		
		System.out.println("학생관리 프로그램");
		int choice;
		do {
			
			showMenu();
			System.out.print("메뉴 > ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if (students[students.length-1] != null) {
					System.out.println("명단이 꽉 찼습니다.");
					break;
				}
				addStd(sc, students);
					
				break;
				
			case 2:
				modifyStd(sc, students);
				break;
				
			case 3:
				delStd(sc, students);
				break;
				
			case 4:
				System.out.println("학생 목록");
				prnStudent(students);
				break;
			}
			
			stdCnt(students);
			
		} while (choice < 5);

		
		
		sc.close();
	}

	public static void delStd(Scanner sc, Student[] students) {
		System.out.println("학생 삭제");
		prnStudent(students);
		System.out.println("몇번째 학생을 삭제하시겠습니까?");
		int delStd = sc.nextInt();
		students[delStd-1] = null;
		for (int i = delStd-1; i < students.length-1; i++) {
			Student tmp = students[i];
			students[i] = students[i+1];
			students[i+1] = tmp;
		}
		prnStudent(students);
	}

	public static void modifyStd(Scanner sc, Student[] students) {
		System.out.println("학생 수정");
		prnStudent(students);
		System.out.println("몇번째 학생을 수정하시겠습니까?");
		int modStd = sc.nextInt();
		
		System.out.println("학생 번호를 입력하세요");
		int stdNo = sc.nextInt();
		System.out.println("학생 이름을 입력하세요");
		String name = sc.next();
		System.out.println("국어점수 입력");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력");
		int math = sc.nextInt();
		students[modStd-1] = new Student(stdNo, name, kor, eng, math);
		
		prnStudent(students);
	}

	public static void addStd(Scanner sc, Student[] students) {
		for(int i = 0; i < students.length; i++) {
			if (students[i]==null) {
				System.out.println("학생 추가");
				System.out.println("학생 번호를 입력하세요");
				int stdNo = sc.nextInt();
				System.out.println("학생 이름을 입력하세요");
				String name = sc.next();
				System.out.println("국어점수 입력");
				int kor = sc.nextInt();
				System.out.println("영어점수 입력");
				int eng = sc.nextInt();
				System.out.println("수학점수 입력");
				int math = sc.nextInt();
				students[i] = new Student(stdNo, name, kor, eng, math);
				prnStudent(students);
				break;
			}
		}
	}

	public static void stdCnt(Student[] students) {
		int curStdCnt = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				curStdCnt = i;
				break;
			} else if (students[students.length-1] != null) {
				curStdCnt = students.length;
				break;
			}
		}
		System.out.println("현재 학생 수는 " + curStdCnt + "명입니다.");
	}

	private static void prnStudent(Student[] students) {
		for (Student std : students) {
			if (std == null)
				break;
			System.out.println(std);
		}
		System.out.println();
	}

	private static void initial(Student[] students) {
		students[0] = new Student(1, "전수린", 90, 90, 90);
		students[1] = new Student(2, "김상건", 91, 91, 91);
		students[2] = new Student(3, "이태훈", 92, 92, 92);
	}

	private static void showMenu() {
		String[] m = new String[6];
		m[0] = "메뉴를 선택하세요.\n";
		m[1] = "1. 학생 추가\n";
		m[2] = "2. 학생 수정\n";
		m[3] = "3. 학생 삭제\n";
		m[4] = "4. 학생 목록\n";
		m[5] = "5. 종료\n";

		for (String str : m) {
			System.out.print(str);
		}
	}
}
