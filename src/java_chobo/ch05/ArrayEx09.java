package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * 2차원 배열
 *
 */
public class ArrayEx09 {

	public static void main(String[] args) {
		int[][] score = new int[4][3];

		System.out.println(Arrays.deepToString(score));
		Random rnd = new Random(123456);

		for (int row = 0; row < score.length; row++) {
			for (int col = 0; col < score[row].length; col++) {
				score[row][col] = rnd.nextInt(100) + 1;
			}
		}

		System.out.println(Arrays.deepToString(score));
//		prnArr(score);
//		
//		int sum = sumArr(score);
//		System.out.println("배열 값의 합은 " + sum);

		점수구하기(score);
	}

	private static void 점수구하기(int[][] score) {
		// 국어 영어 수학 총점 평균
		// 과목별 총점

		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;

		for (int row = 0; row < score.length; row++) {
			int sum = 0;
			double avg = 0.0;
			korScore = korScore + score[row][0];
			engScore = engScore + score[row][1];
			mathScore = mathScore + score[row][2];
			for (int col = 0; col < score[row].length; col++) {
				sum = sum + score[row][col];
				System.out.printf("%5d", score[row][col]);
			}
			avg = sum / (double) score.length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("=====================================");
		System.out.printf("%5d %4d %4d", korScore, engScore, mathScore);

	}

	private static int sumArr(int[][] score) {
		int sum = 0;
		for (int row = 0; row < score.length; row++) {
			for (int col = 0; col < score[row].length; col++) {
				sum = sum + score[row][col];
			}
		}
		return sum;
	}

	private static void prnArr(int[][] score) {
		for (int[] intArr : score) {
			for (int s : intArr) {
				System.out.print(s + "\t");
			}
			System.out.println();
		}

	}

}
