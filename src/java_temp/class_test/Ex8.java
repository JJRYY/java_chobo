package java_temp.class_test;

public class Ex8 {

	public static void main(String[] args) {
		Buyer00 b = new Buyer00();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		
		
	}

}
