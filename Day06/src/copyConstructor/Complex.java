package copyConstructor;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex(Complex copy) {
		System.out.println("Copy Constructor Called!");
		real = copy.real;
		imaginary = copy.imaginary;
	}
	
	// Override the toString of Object class
	@Override
	public String toString() {
		return "(" + real + " + " + imaginary + "i)";
	}
	
	// Overriding the equals of Object class
	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || object.getClass() != this.getClass()) {
			return false;
		}
		
		Complex complex = (Complex) object;
		return (this.real == complex.real && this.imaginary == complex.imaginary);
	}

}
