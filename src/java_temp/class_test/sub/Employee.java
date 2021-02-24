package java_temp.class_test.sub;

public class Employee {
	String name;
	int age;
	String address;
	String dep;
	int salary;
	int workTime;
	int salaryPerHour = 10000;
	
	public Employee() {
	}

	public Employee(String name, int age, String address, String dep) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dep = dep;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setWorkHours(int workTime) {
		this.workTime = workTime;
		this.salary = workTime * salaryPerHour;
		
	}
	
	void printInfo() {
		System.out.printf("name=%s, age=%d, address=%s, dep=%s%n", name, age, address, dep);
	}
	
	
}
