package java_chobo.ch07;

public class Exam06_01 {

	public static void main(String[] args) {
//		exam_circle();

		Point p1 = new Point(100, 100);
		Point p2 = new Point(140, 50);
		Point p3 = new Point(200, 100);
		
		Triangle tri1 = new Triangle(new Point[] { p1, p2, p3 });
		System.out.printf("%d %d%n", tri1.p[0].x, tri1.p[0].y);
		System.out.printf("%d %d%n", tri1.p[1].x, tri1.p[1].y);
		System.out.printf("%d %d%n", tri1.p[2].x, tri1.p[2].y);
		
		System.out.println(tri1.color);
		
		System.out.println(tri1);
	}

	public static void exam_circle() {
		Circle c1 = new Circle();
		System.out.println(c1.center.x);
		System.out.println(c1.center.y);
		System.out.println(c1.r);
		System.out.println();
		
		Point center = new Point(100, 100);
		Circle c2 = new Circle(center, 150);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		System.out.println(c2.r);
	}
}	
