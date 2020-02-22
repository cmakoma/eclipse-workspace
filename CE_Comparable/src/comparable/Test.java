// Assignement CE_Comparable
// Program Test
// Author Christian Makoma
// Created Jan 16, 2020


package comparable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> rectList = values.getRectangle();

		Collections.sort(rectList);
		System.out.println("heights	widths	Diagonals");
		
		for(Rectangle r: rectList) {
			System.out.println(r.getHeight()+ "\t" + r.getWidth()+"\t"+ r.getDiagonal());
		}
		
		System.out.println("reverse order diagonal:");
		Collections.reverse(rectList);
		
		for(Rectangle r: rectList) {
			System.out.println(r.getHeight()+ "\t" + r.getWidth()+"\t"+ r.getDiagonal());
		}
		
		String[] arrayNames = values.getNames();
		
		Arrays.sort(arrayNames, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Names:");
		for(String s: arrayNames) {
			System.out.println(s.toString());
		}
		
		
	
	}
	
	
	

}
