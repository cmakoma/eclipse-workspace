// Assignement CE_Balanced_BST
// Program City
// Author Christian Makoma
// Created Mar 10, 2020


package balanced;

public class City {
	// It has two fields: City and State (2 letter abbreviation), 
	//	a parameterized constructor, and a toString method of 
	//	that form:  {city} ({state})     e.g. Sandy (UT)
	
	private String city;
	private String state;
	
	public City(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return city + " (" + (state.length() >= 2 ? state.substring(0,2).toUpperCase() :state.toUpperCase()) + ")";
	}
	
	
	
	
}
