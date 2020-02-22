// Assignement 1410_A04_Inheritance
// Program IsoscelesRightTriangle
// Author Christian Makoma
// Created Nov 25, 2019

public class IsoscelesRightTriangle {
	private final int leg;
	
	/**
	 * constructor that initializes Isoscele's Right Triangle
	 * @param leg 
	 */
	public IsoscelesRightTriangle(int leg) {
		super();
		this.leg = leg;
	}
	
	/**
	 * 
	 * @param hyp is hypotenuse value of type double  
	 * @return hypotenuse
	 */
	public double hypotenuse(double hyp) {
		return hyp;
	}

	/**
	 * @return leg value of leg
	 */
	public int getLeg() {
		return leg;
	}

	/**
	 * to String generates IsoscelesRightTriangle(leg) e.g. IsoscelesRightTriangle(5)
	 */
	@Override
	public String toString() {
		return String.format("IsoscelesRightTriangle (%d)", leg);
	}
	
	
}
