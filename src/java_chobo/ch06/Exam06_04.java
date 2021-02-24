package java_chobo.ch06;

import java_chobo.ch06.dto.Car;

public class Exam06_04 {

	public static void main(String[] args) {
		Car car1 = new Car("red", "auto", 5);
		System.out.println(car1);
		
		Car car2 = new Car(car1);
		System.out.println(car2);
		
		Car car3 = new Car();
		System.out.println(car3);
	}

}
