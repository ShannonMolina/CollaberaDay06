package constructors;

/**
 * Returns the sum of this Fraction
 * and the parameter frac. 
 * 
 * @author User
 */

public class Fraction {
	private double numerator, denominator;
	
	/**
	 * Zero parameter constructor
	 * 
	 * */
	public Fraction() {
		//creates 0/1
		this(0,1);
	}
	
	/** Constructor with one double parameter
	 *
	 * @param number the numerator*/
	public Fraction(double number) {
		//creates number/1
		this(number, 1);
	}
	
	/** Contsructor with one Fraction parameter
	 * 
	 * @param frac the fraction containing numerator and denominator
	 * */
	public Fraction(Fraction frac) {
		//copy constructor
		this(frac.getNumerator(), frac.getDenominator());
	}
	
	/** Constructor with two int parameters
	 * *
	 * @param num the numerator
	 * @param denom the denominator
	 */
	public Fraction(double num, double denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	/** Getter for numerator
	 * 
	 * @return numerator the numerator
	 */
	public double getNumerator() {
		return numerator;
	}
	
	/** Setter for numerator
	 * 
	 * @param numerator the numerator
	 */
	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}
	
	/** Getter for denominator
	 * 
	 * @return denominator the denominator
	 */
	public double getDenominator() {
		return denominator;
	}
	
	/** Setter for denominator
	 * 
	 * @param denominator the denominator
	 */
	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
	/** Computes numerator divided by denominator (not simplified)
	 * 
	 * @return numerator/denominator numerator divided by denominator
	 */
	public double compute() {
		return numerator/denominator;
	}
}
