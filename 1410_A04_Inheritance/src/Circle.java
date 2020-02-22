// Assignement 1410_A04_Inheritance
// Program Circle
// Author Christian Makoma
// Created Nov 25, 2019

public class Circle {
	private final int radius;
	
	/**
	 *  constructor that generates a circle
	 * @param r is the radius of the circle
	 */
	public Circle(int r) {
		this.radius = r;
	}
	
	/**
	 * @param radius
	 * @return diameter
	 */
	public int diameter(int radius) {
		return 2*radius;
	}
	
	/**
	 * @return circumference 
	 */
	public double circumference() {
		return diameter(radius)*Math.PI;
	}

	/**
	 * getter for the field radius
	 * @return radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * to String generates Circle(radius) e.g. Circle(3)
	 */
	public String toString() {
		return String.format("Circle(%d)", radius);
	}
}
