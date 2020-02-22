// Assignement 1410_A04_Inheritance
// Program Rectangle
// Author Christian Makoma
// Created Nov 25, 2019

public class Rectangle {
	private final int length, width;
	
	/**
	 * constructor that initializes both fields
	 * @param l is length of a rectangle
	 * @param w is width of a rectangle
	 */
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}

	/**
	 * @return length of rectangle
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return width of rectangle
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * toString generates Rectangle(lengthxwidth) e.g. Rectangle(5x4)
	 */
	@Override
	public String toString() {
		return String.format("Rectangle (%dX%d)", length, width);
	}
	
	
}
