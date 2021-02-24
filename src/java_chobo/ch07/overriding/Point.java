package java_chobo.ch07.overriding;

public class Point {
	private int x;
	private int y;
	
	String getLocation() {
		return String.format("x=%d, y=%d, ", x, y);
	}
}
