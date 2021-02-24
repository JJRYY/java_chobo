package java_chobo.ch07.poly;

public class Ambulance extends Car {
	
	
	public Ambulance(String color, int door) {
		super(color, door);
	}

	public void siren() {
		System.out.println("siren~~");
	}

	@Override
	public String toString() {
		return String.format("Ambulance [%s]", super.toString());
	}
	
	
}
