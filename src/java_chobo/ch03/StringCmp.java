package java_chobo.ch03;

public class StringCmp {

	public static void main(String[] args) {
		// 문자열(참조형) 비교 equals()
		String str01 = new String("abc");
		String str02 = new String("abc");

		// 값 비교
		if (str01 == str02) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

//		if (str01 == str02)
//			System.out.println("같음");
//		else
//			System.out.println("다름");

		// 내용 비교
		if (str01.equals(str02)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		String str03 = "abc";
		String str04 = "abc";

		if (str03 == str04) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if (str01 == "abc") {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}
