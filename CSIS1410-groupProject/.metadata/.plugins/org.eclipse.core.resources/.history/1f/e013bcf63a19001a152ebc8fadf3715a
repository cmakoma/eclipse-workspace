// Assignement first try
// Program FoodApp
// Author Christian Makoma
// Created Dec 4, 2019


package firstTry;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FoodApp {
	
	private static ArrayList<Food> orderList = new ArrayList<Food>();
	
	public static void addOrder(Food item) {
		orderList.add(item);
	}

	public static void writeOrder() {
		try(PrintWriter writer = new PrintWriter("C:\\Users\\bigbe\\CSIS1410-groupProject\\FirstTry\\src\\firstTry\\menuList.cvs")) {
			double totalPrice = 0;
			for (Food f: orderList) {
				writer.println(f);
				totalPrice += f.getPrice();
			}
			writer.println(String.format("Total: $%.2f", totalPrice));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}
