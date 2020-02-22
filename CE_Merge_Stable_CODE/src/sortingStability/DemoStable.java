// Assignement CE_Merge_Stable_CODE
// Program DemoStable
// Author Christian Makoma
// Created Feb 20, 2020


package sortingStability;

import java.util.Arrays;
import java.util.Comparator;

import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Selection;

public class DemoStable {

	public static void main(String[] args) {
		Rectangle[] Rectangles = {
				new Rectangle(4,2),
				new Rectangle(3,5),
				new Rectangle(4,3),
				new Rectangle(6,2),
				new Rectangle(3,4),
				new Rectangle(4,4),
				new Rectangle(6,4),
				new Rectangle(12,2),
				new Rectangle(2,4),
				new Rectangle(4,6),
				new Rectangle(2,12),
				
		};
		
		
		
		System.out.println("Rectangles	: " + Arrays.toString(Rectangles));
		
//		Selection.sort(Rectangles);
//		System.out.println("sorted by length: " + Arrays.toString(Rectangles));
		
		Selection.sort(Rectangles, Rectangle.BY_AREA);
		System.out.println("sorted by area	: " + Arrays.toString(Rectangles));
		
		Merge.sort(Rectangles);
		System.out.println("sorted by length: " + Arrays.toString(Rectangles));


	}

}
