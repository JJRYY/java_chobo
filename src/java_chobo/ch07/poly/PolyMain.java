package java_chobo.ch07.poly;

public class PolyMain {

	public static void main(String[] args) {
		// up-casting
		
		Car c = new Ambulance("red", 2);
		Car c2 = new FireEngine();
		
		c2.setColor("white");
		c2.setDoor(4);
		
		System.out.println(c);
		System.out.println(c2);
		
		// down-casting
		
		FireEngine c4 = (FireEngine) c2;
		System.out.println(c4);
		
		Ambulance c3 = (Ambulance) new Car(); // runtime error
		c3.setColor("blue");
		System.out.println(c3);
	}

}
