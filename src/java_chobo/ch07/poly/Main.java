package java_chobo.ch07.poly;

abstract class Animal {
	abstract void cry(); 
	abstract void eat();
}
class Lion extends Animal {
	@Override
	void cry() {
		System.out.println("어흥");
	}

	@Override
	void eat() {
		System.out.println("잡아먹음");
		
	}
	
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("월월");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("꼬꼬댁");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

}


public class Main {
	public static void main(String[] args) {
		Animal[] anis = new Animal[4];
		anis[0] = new Dog();
		anis[1] = new Cat();
		anis[2] = new Bird();
		anis[3] = new Lion();
		
		for(Animal ani : anis) {
			ani.cry();
			if (ani instanceof Lion) {
				((Lion)ani).eat();
			}
		}
	}
}
