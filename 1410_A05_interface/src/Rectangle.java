// Assignement 1410_A04_Inheritance
// Program Rectangle
// Author Christian Makoma
// Created Nov 25, 2019

public class Rectangle implements Shape, Printable{
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
		
		return (getLength()+ getWidth())*2;
	}

	@Override
	public double area() {
		
		return getLength()* getWidth();
	}
	
	
}
