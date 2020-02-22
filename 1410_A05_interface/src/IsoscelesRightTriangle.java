// Assignement 1410_A04_Inheritance
// Program IsoscelesRightTriangle
// Author Christian Makoma
// Created Nov 25, 2019

public class IsoscelesRightTriangle implements Shape, Printable{
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

	@Override
	public void print() {
		for (int i = 1; i <= getLeg(); i++) {

            for (int j = 1; j <= i; j++) {

                if (i == 1 || i == getLeg()) {
                    System.out.print("* ");
                } else if (j == 1 || j == getLeg()) {
                    System.out.print("* ");
                } else if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
		
	}

	@Override
	public double perimeter() {
		return (getLeg() * 2) + Math.hypot(getLeg(), getLeg());
	}

	@Override
	public double area() {
		return (getLeg() * getLeg()) / 2;
	}
	
	
}
