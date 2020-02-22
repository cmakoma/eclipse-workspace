// Assignement 2420_Midterm1
// Program CityApp
// Author Christian Makoma
// Created Feb 18, 2020


package midterm1;

import java.util.Arrays;
import java.util.Comparator;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class CityApp {
	public static void main(String[] agrs) {
		City[] cities = {
				new City("Chicago", 2715000, 5498),
				new City("Denver", 634000, 1292),
				new City("New York", 8337000, 8683),
				new City("San Francisco", 826000, 1365),
				new City("Seattle", 635000, 2470)
		};
		
		// Part 1		
		StdOut.println("Cities: ");
		for(City c : cities) {
			StdOut.println(c);
		}
		
		StdOut.println();
		
		
        // TODO part 1
		StdOut.println("Cities sorted by population density: ");
		Arrays.sort(cities, new Comparator<City>() {
			@Override
			public int compare(City o1, City o2) {
				return (int) ((float)o1.getPopulation()/o1.getArea() - (float)o2.getPopulation()/o2.getArea());
			}
			
		});
		StdOut.println("Cities: ");
		for(City c : cities) {
			StdOut.println(c);
		}
		StdOut.println();
		
		// Part 2
		// TODO part 2
		StdOut.println("Expected Output after Prt2: ");
		Stack<City> citiesStack = new Stack<>();
		StdOut.println("Cities: ");
		for(City c : cities) {
			citiesStack.push(c);
			StdOut.println(c);
		}
		
		StdOut.println();

//		StdOut.println(citiesStack);
		
		
		StdOut.println("Large cities listed in reverse order: ");
		
		while(!citiesStack.isEmpty()) {
			City largeCity = citiesStack.pop();
			if(largeCity.getPopulation() > 1000000) {
				StdOut.println(largeCity);
			}
		}

	}
}

