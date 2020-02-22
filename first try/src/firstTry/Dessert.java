// Assignement first try
// Program Dessert
// Author Christian Makoma
// Created Dec 4, 2019


package firstTry;


import javax.swing.Icon;

public class Dessert extends Food {
	
	private String flavor;

	public Dessert(String name, double price, String flavor) {
		super(name, price);
		this.flavor = flavor;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	@Override
	public String toString() {
		return String.format("A %s %s is $%.2f", flavor, super.getName(), super.getPrice());
	}

}
