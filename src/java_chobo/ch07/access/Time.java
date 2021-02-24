package java_chobo.ch07.access;

public class Time {
	private int hour;
	private int minute;
	private int second;

	
	public Time() {
		this.hour = -1;
		this.minute = -1;
		this.second = -1;
	}
	
	public Time(int hour, int minute, int second) {
		setHour(hour);
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return String.format("Time [hour=%s, minute=%s, second=%s]", hour, minute, second);
	}

	public static void main(String[] args) {
		Time t = new Time();
		System.out.println(t);
		t.setHour(23);
		System.out.println(t);

	}

}
