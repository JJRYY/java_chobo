package java_temp.class_test.sub;

public class Temporary extends Employee {
//	int workTime;
//	int salaryPerHour = 10000;
	
	public Temporary(String name, int age, String address, String dep) {
		super(name, age, address, dep);
	}
	
	public void setWorkHours(int workTime) {
//		this.workTime = workTime;
//		this.salary = workTime * salaryPerHour;
		super.setWorkHours(workTime);
	}
	
	void printInfo() {
		System.out.printf("비정규직, 일한 시간 = %d, 급여 = %d%n", workTime, salary);
	}

}
