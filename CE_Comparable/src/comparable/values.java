// Assignement CE_Comparable
// Program values
// Author Christian Makoma
// Created Jan 23, 2020


package comparable;

import java.util.ArrayList;
import java.util.List;

public class values {
	
	public static List<Rectangle> getRectangle() {
		List<Rectangle> rectangles = new ArrayList<>();
		
		rectangles.add(new Rectangle(2,4));
		rectangles.add(new Rectangle(3,5));
		rectangles.add(new Rectangle(10,14));
		rectangles.add(new Rectangle(13,43));
		rectangles.add(new Rectangle(21,21));
		
		return rectangles; 
	}
	
	public static String[] getNames() {
		String[] names = new String[4];
//		String[] names = {"hey", "how","are", "you"};
		
		names[0] = "christian";
		names[1] = "MAkoMa";
		names[2] = "diAne";
		names[3] = "PaulinE";
		
		return names;
	}

}
