// Assignement CE_Merge_Stable_CODE
// Program Rectangle
// Author Christian Makoma
// Created Feb 20, 2020


package sortingStability;

import java.util.Comparator;

public class Rectangle implements Comparable<Rectangle> {
	private int length;
	private int width;
	public static final Comparator<Rectangle> BY_AREA = new CompareByArea();
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int perimeter() {
		return 2*(length + width);
	}
	
	public int area() {
		return length * width;
	}
	
	@Override
	public String toString() {
		return "[" + length + "x" + width + "]";
	}

	@Override
	public int compareTo(Rectangle o) {
		
		return this.length - o.length;
	}
	
	private static class CompareByArea implements Comparator<Rectangle> {

		@Override
		public int compare(Rectangle o1, Rectangle o2) {
			
			return o1.area() - o2.area();
		}
		
	}
}
