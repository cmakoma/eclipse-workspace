// Assignement 1410_A05_interface
// Program InterfaceApp
// Author Christian Makoma
// Created Nov 29, 2019

public class InterfaceApp {

	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle(6,3);
		
		Square mySquare = new Square(5);
		
		IsoscelesRightTriangle myIsoscelesRightTriangle = 
				new IsoscelesRightTriangle(6);
		
		Circle myCircle = new Circle(5);
		
		System.out.println(myRectangle.toString());
		System.out.println();
		System.out.println(mySquare.toString());
		System.out.println();
		System.out.println(myIsoscelesRightTriangle.toString());
		System.out.println();
		
		System.out.println(myCircle.toString());
		System.out.printf("Diamter: %d\n", myCircle.diameter(myCircle.getRadius()));
		System.out.printf("Circumference: %.1f\n\n", myCircle.circumference());
		
		System.out.println("Shape Array:\n------------");
		
		Shape[] shapeArray = {mySquare, myRectangle,myIsoscelesRightTriangle, myCircle };
		
		for(Shape shape: shapeArray) {
			System.out.println(shape.toString());
			System.out.printf("Perimeter: %.1f\n", shape.perimeter());
			System.out.printf("Area: %.1f\n",shape.area());
			if(shape instanceof Printable) {
				((Printable) shape).print();
				System.out.println();
			}
			
			System.out.println();
		}


	}

}
