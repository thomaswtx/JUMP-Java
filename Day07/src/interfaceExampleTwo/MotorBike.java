package interfaceExampleTwo;

public class MotorBike implements Vehicle {
	
	private final String brand;
	
	public MotorBike(String brand) {
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
		return "The motorbike is speeding up.";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The motorbike is slowing down.";
	}
}
