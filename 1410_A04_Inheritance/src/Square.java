// Assignement 1410_A04_Inheritance
// Program Square
// Author Christian Makoma
// Created Nov 25, 2019

public class Square extends Rectangle{
	
	/**
	 * constructor is used to initialize both fields of Rectangle 
	 * @param a is the side of parameter
	 */
	public Square(int side) {
		super(side, side);

	}
	
	/**
	 * @return side of the square
	 */
	public int getSide() {
		return super.getLength();
	}
	
	/**
	 * to String generates Square(side) e.g. Square(4) 
	 */
	@Override
	public String toString() {
		return String.format("Square (%d)", getLength());
	}
	
	
}
