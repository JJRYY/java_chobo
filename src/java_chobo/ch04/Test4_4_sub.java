package java_chobo.ch04;

public class Test4_4_sub {

	public static void main(String[] args) {
		int holSum = 0;
		int jjakSum = 0;
		int totalSum = 0;
		int i = 0;
		
		for (i = 0; true; i++) {
			if (i%2==0) {
				jjakSum = jjakSum + (-i);
			} else {
				holSum = holSum + i;
			}
			
			totalSum = jjakSum + holSum;
			
			if (totalSum >= 100)
				break;
		
		}
		
		System.out.printf("i = %d, Sum = %d", i, totalSum);
	}

}
