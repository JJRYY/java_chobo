package java_chobo.ch04;

import java.util.Random;

public class Ex4_7 {

	public static void main(String[] args) {
		// 0.0 <- Math.random() < 1.0
		// 0.0 * 3 <= Math.random() < 1.0 * 3
		// 0.0 <= Math.random() < 3.0   --> int 변환
		// 0 <= Math.random() < 3
		// 1 <= Math.random() < 4
		// 1~3 사이의 정수를 생성
		System.out.println((int)(Math.random()*3) + 1);
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(3)+1);
		
		// 임의의 정수 : 0~100
		System.out.println(rnd.nextInt(101));
		
		
		
//		enum_switch();
	}

	public static void enum_switch() {
		Title t = Title.CEO;
		
		switch(t) {
		case CEO:
			System.out.println("사장");
			System.out.println(t.ordinal());
			break;
		case MANAGER:
			System.out.println("매니저");
			break;
		case STAFF:
			System.out.println("직원");
			break;
		case INTERN:
			System.out.println("인턴");
			break;
		}
	}

}
