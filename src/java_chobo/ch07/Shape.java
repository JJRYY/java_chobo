package java_chobo.ch07;

public class Shape {
//	String color = "blue";
	String color;
	
	public Shape() {
		color = "blue";
	}

	void draw() {
		// 도형을 그린다
	}

	@Override
	public String toString() {
		return String.format("Shape [color=%s]", color);
	}
}
