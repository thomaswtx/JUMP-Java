package interfaceExampleTwo;

public class MultiAlarmCar implements Vehicle, Alarm {
	
	private final String brand;
	
	public MultiAlarmCar(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "The car is speeding up.";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The car is slowing down.";
	}

	@Override
	public String turnAlarmOn() {
		// TODO Auto-generated method stub
		return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
	}

	@Override
	public String turnAlarmOff() {
		// TODO Auto-generated method stub
		return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
	}

}
