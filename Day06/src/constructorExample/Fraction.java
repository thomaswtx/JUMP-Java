package constructorExample;

import java.util.PrimitiveIterator.OfDouble;

/**
 * Returns the sum of this Fraction and the parameter frac. 
 * The sum returned is NOT simplified.
 * 
 * @param fract the Fraction to add to this Fraction
 * 
 * @return the sum {@link OfDouble} this and frac
 * @author Thomas White
 *
 */

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		//creates 0/1
		this(0, 1);
	}
	public Fraction(int number) {
		//creates number/1
		this(number, 1);
	}
	public Fraction(Fraction fraction) {
		//copy constructor
		this(fraction.getNumerator(), fraction.getDenominator());
	}
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	/**
	 * Returns the sum of this Fraction and the parameter frac. 
	 * The sum returned is NOT simplified.
	 * 
	 * @param fract the Fraction to add to this Fraction
	 * 
	 * @return the division {@link OfDouble} this and frac
	 * @author Thomas White
	 *
	 */
	public int divide() {
		return getNumerator()/getDenominator();
	}

}
