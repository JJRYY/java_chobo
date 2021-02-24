package java_temp.class_test.sub;

public class Regular extends Employee {
//	int salary;
	
	public Regular(String name, int age, String address, String dep) {
		super(name, age, address, dep);
	}
	
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

	void printInfo() {
		System.out.printf("정규직, 급여 = %d%n", salary);
	}

	
	
	
}
