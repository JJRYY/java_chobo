package java_chobo.ch07.overriding;

public class Point3D extends Point {
	int z;
	
	@Override
	String getLocation() {
//		return String.format("x=%d y=%d z=%d%n", x, y, z);
//		return String.format("%s z=%d%n", super.getLocation(), z);
		return super.getLocation() + String.format("z=%d%n", z);
	}
}
