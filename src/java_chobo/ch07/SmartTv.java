package java_chobo.ch07;

public class SmartTv extends Tv {
	boolean caption;
	void displaycaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
