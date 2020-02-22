// Assignement CE_Comparable
// Program Rectangle
// Author Christian Makoma
// Created Jan 16, 2020


package comparable;

public class Rectangle implements Comparable<Rectangle> {

	private int width;
	private int height;
	private int diagonal;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.diagonal = (int) Math.sqrt((height*height) + (width*width));
	}
	
	

	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getDiagonal() {
		return diagonal;
	}



	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
	}



	@Override
	public int compareTo(Rectangle o) {
		
		return this.diagonal - o.diagonal;
	}



	
}
