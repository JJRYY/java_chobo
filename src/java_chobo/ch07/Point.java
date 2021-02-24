package java_chobo.ch07;

public class Point {
	int x;
	int y;
	
	public Point() {
		this(0, 0);
//		x = 0;
//		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}
	
	
}
