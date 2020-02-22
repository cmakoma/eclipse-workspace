// Assignement 1410_A04_Inheritance
// Program Square
// Author Christian Makoma
// Created Nov 25, 2019

public class Square extends Rectangle implements Shape, Printable{
	
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

	@Override
	public void print() {
		for (int i = 0; i < getWidth(); i++) {
            System.out.print("* ");
            for (int j = 0; j < getLength() - 2; j++) {
                if (i == 0 || i == getWidth() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("* ");
            System.out.println();
	}
		
	}

	@Override
	public double perimeter() {
		
		return getLength() * 4;
	}

	@Override
	public double area() {
		
		return getLength()* getWidth();
	}
	
	
}
