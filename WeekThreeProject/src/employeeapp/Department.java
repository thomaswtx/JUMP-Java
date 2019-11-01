package employeeapp;

public enum Department {

	// Department categories
	ACCOUNTING(1),
	HR(2),
	DEVELOPMENT(3),
	SALES(4);

	private int value;

	private Department(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
