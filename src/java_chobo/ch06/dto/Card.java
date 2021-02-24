package java_chobo.ch06.dto;

public class Card {
	// 인스턴스 변수는 소문자로 표시(두 단어 조합시 카멜 표기)
	private String kind;
	private int number;

	// 클래스 변수는 대문자로 표시(두 단어 조합시 언더바_ 표기)
	public static int WIDTH = 100;
	public static int HEIGHT = 250;

	// default constructor
//	public Card() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("[%s  %s]", kind, number);
	}

	
	
	

}
