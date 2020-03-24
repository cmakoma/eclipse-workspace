// Assignement CE_Balanced_BST
// Program CityApp
// Author Christian Makoma
// Created Mar 10, 2020


package balanced;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;

public class CityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ST<Integer, City> cities = new ST<>();
		System.out.println("keys and their associated cities in order: ");
	
		try{
			In in = new In("us_postal_codes.csv");
			String line = in.readLine();
			
			while(line != null) {
				line = in.readLine();
				if (line != null) {
					String[] temp = line.split(",");
					Integer zip = Integer.parseInt(temp[0]);
					cities.put(zip, new City(temp[1],temp[2]));
				}
		
			}
			for(Integer i : cities.keys()) {
				System.out.println(i + " ... " + cities.get(i));
			}
			
			}
			 catch (StringIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
		SecureRandom random = new SecureRandom();
		int num = 0;
		

		
		while(cities.get(num) == null) {
			num = random.nextInt(100000);
		}
		
		System.out.println("City of Random Zipcode " + num + " is " + cities.get(num));
		System.out.println();
		
		System.out.println( "Maximum zipcode is " + cities.max());
		System.out.println();
		
		System.out.println( "Maximum zipcode is " + cities.min());
		System.out.println();
		
		int count = 0;
		
		for(Integer i : cities.keys()) {
			if(i < num) {
				count = count + 1;
			}
		}
		
		System.out.println("zip codes smaller than " + num + " are "+ count + " zip codes");
		
	}

	

	

}
