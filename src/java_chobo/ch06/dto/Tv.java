package java_chobo.ch06.dto;

public class Tv {	// extends Object 생략됨
	// 속성 선언 (멤버 변수)
	public String color;		// 색상
	public boolean isPower;	// 전원상태
	public int channel;		// 채널
	
	public Tv() {
		super();	// 부모클래스의 생성자를 호출
	}

	// 기능 (멤버 메서드)
	public void setPower() {
		this.isPower = !isPower;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	
	@Override // 부모클래스에 있는 것을 재정의
	public String toString() {
		return String.format("Tv [color=%s, isPower=%s, channel=%s]", color, isPower, channel);
	}
	
	
	
}
