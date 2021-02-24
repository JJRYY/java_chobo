package java_chobo.ch07;

import java.util.Arrays;

public class Triangle extends Shape {
	Point[] p;
	
	public Triangle(Point[] p){
		this.p = p;
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] {p1, p2, p3};
	}

	@Override
	public String toString() {
		return String.format("Triangle [p=%s, color=%s]", Arrays.toString(p), super.toString());
	}
}
