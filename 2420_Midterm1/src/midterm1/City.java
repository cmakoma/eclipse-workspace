// Assignement 2420_Midterm1
// Program City
// Author Christian Makoma
// Created Feb 18, 2020


package midterm1;

public class City {
	private final String name;
	private final int population;
	private final int area;
	
	
	public City(String name, int population, int area) {
		this.name = name;
		this.population = population;
		this.area = area;
		
	}
	
	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public int getArea() {
		return area;
	}

//	@Override
//	public String toString() {
//		return String.format("%-15s population: %-8d area: %d",
//			name, population, area);
//	}
	
	@Override
	public String toString() {
		return String.format("%-15s density: %-8.1f",
			name,(float) population/area);
	}
	
	
}
