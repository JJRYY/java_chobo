package java_chobo.ch07.poly;

public class PolyMain2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		prnInstanceOf(car1);
		System.out.println();
		prnInstanceOf(new Ambulance("red", 4));
		System.out.println();
		prnInstanceOf(new FireEngine());
	}

	private static void prnInstanceOf(Object obj) {
		if (obj instanceof Object) {
			System.out.println("Object");
		}
		
		if (obj instanceof Car) {
			System.out.println("Car");
		}
		
		if (obj instanceof Ambulance) {
			System.out.println("Ambulance");
		}
		
		if (obj instanceof FireEngine) {
			System.out.println("FireEngine");
		}
	}
}
