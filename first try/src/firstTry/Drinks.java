// Assignement first try
// Program Drinks
// Author Christian Makoma
// Created Dec 4, 2019


package firstTry;

import javax.swing.Icon;

public class Drinks extends Food {
	
	private String size;

	public Drinks(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return String.format("A %s %s is $%.2f", size, super.getName(), super.getPrice());
	}

}
