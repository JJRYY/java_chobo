package java_chobo.ch06;

import java_chobo.ch06.dto.Tv;

public class Ex06_01 {

	public static void main(String[] args) {
		Tv t1;			// 객체를 다루기 위한 참조변수 선언
		t1 = new Tv();	// Tv 인스턴스화
		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		System.out.println(t1);	// t1.toString() 호출
		
		t1.color = "red";
		t1.isPower = true;
		t1.channel = 11;
		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		System.out.println(t1);	// t1.toString() 호출
		
		t1.setPower();
		t1.channelUp();
		t1.channelUp();
		t1.channelDown();
		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		System.out.println(t1);	// t1.toString() 호출
	
		Object o1 = new Tv();
		System.out.println(o1);
	}

}
