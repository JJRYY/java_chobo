package java_chobo.ch07;

public class VCR {
	boolean power;
	int counter = 0;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("VCR Play");
	}
	
	void stop() {
		System.out.println("VCR Stop");
	}
	
	void rew() {
		System.out.println("VCR rew");
	}
	
	void ff() {
		System.out.println("VCR ff");
	}
}
