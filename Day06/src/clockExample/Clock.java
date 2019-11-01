package clockExample;

public class Clock {
	
	private int hour;
	private int minute;
	private int second;
	
	public Clock() {
		this(0, 0, 0);
	}
	public Clock(int hour) {
		this(hour, 0, 0);
	}
	public Clock(int hour, int minute) {
		this(hour, minute, 0);
	}
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
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
		return "H:" + hour + " M:" + minute + " S:" + second;
	}
	
	
}
