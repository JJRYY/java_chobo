package java_chobo.ch07;

public class Ex07_01 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displaycaption("Hello, World");
		stv.caption = true;
		stv.displaycaption("Hello, World");
	}

}
