package java_chobo.ch04;

import java.util.*;

import javax.swing.JOptionPane;

public class Ex4_15 {

	public static void main(String[] args) {
		// do - while

		int input = 0;
		Random rnd = new Random();
		int answer = rnd.nextInt(100) + 1;

//		Scanner sc = new Scanner(System.in);
		String res = null;

		do {
			/* System.out.print("1과 100 사이의 정수를 입력하세요"); */

			res = JOptionPane.showInputDialog("1 ~ 100까지 정수를 입력하세요");
			input = Integer.parseInt(res);

			System.out.println("입력값 " + input + " answer : " + answer);

			if (input > answer) {
				System.out.println("이하");
			}
			if (input < answer) {
				System.out.println("이상");
			}

		} while (input != answer);

		System.out.println("정답");

	}

}
