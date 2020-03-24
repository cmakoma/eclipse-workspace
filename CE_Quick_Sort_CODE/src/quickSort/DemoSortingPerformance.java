// Assignement CE_Quick_Sort_CODE
// Program DemoSortingPerformance
// Author Christian Makoma
// Created Mar 3, 2020


package quickSort;

import java.util.Random;

import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.Selection;

public class DemoSortingPerformance 
{
	int[] definedArray;
	
	public DemoSortingPerformance()
	{
		
	}
	
	private static Integer[] getRandomNumberArray(int arraySize, int numberOfDigits)
	{
		Integer[] definedArray = new Integer[arraySize];
		Random randomDigits = new Random();
		
		for (int i = 0; i < definedArray.length ; i++)
		{
			definedArray[i] = randomDigits.nextInt((int)Math.pow(10,numberOfDigits) - (int)Math.pow(10, numberOfDigits - 1) - 1) + (int)Math.pow(10, numberOfDigits - 1);
		}
		
		return definedArray;
		
	}

	public static void main(String[] args) 
	{
		int digits = 3;
		Integer[] inputArray1 = getRandomNumberArray(100,digits);
		Integer[] inputArray2 = inputArray1.clone();
		
		int digits2 = 6;
		Integer[] inputArray3 = getRandomNumberArray(10000, digits2);
		Integer[] inputArray4 = inputArray3.clone();
		
		long selectionStart1 = System.currentTimeMillis();
		Selection.sort(inputArray1);
		long selectionStop1 = System.currentTimeMillis();

		
		long selectionDuration1 = (selectionStop1  - selectionStart1);
//		System.out.println(selectionDuration);
		
		long quickStart1 = System.currentTimeMillis();
		Quick.sort(inputArray2);
		long quickStop1 = System.currentTimeMillis();
		long quickDuration1 = (quickStop1  - quickStart1);
//		System.out.println(quickDuration);
		
		long selectionStart2 = System.currentTimeMillis();
		Selection.sort(inputArray3);
		long selectionStop2 = System.currentTimeMillis();
		long selectionDuration2 = (selectionStop2 - selectionStart2);
		
		long quickStart2 = System.currentTimeMillis();
		Selection.sort(inputArray4);
		long quickStop2 = System.currentTimeMillis();
		long quickDuration2 = (quickStop2 - quickStart2);
		
		
		System.out.print("\t\tSelection Sort:\tQuick Sort:\n"
				+ "Array Size: \t" + inputArray1.length + "\t\t" + inputArray2.length + "\n"
				+ "Digits: \t" + digits + "\t\t" + digits + "\n"
				+ "Sorting Time: \t" + selectionDuration1 + "ms" + "\t\t" + quickDuration1 + "ms" +"\n\n"
				+ "Array Size: \t" + inputArray3.length + "\t\t" + inputArray4.length + "\n"
				+ "Digits: \t" + digits2 + "\t\t" + digits2 + "\n"
				+ "Sorting Time: \t" + selectionDuration2 + "ms" + "\t\t" + quickDuration2 + "ms" +"\n\n"
				+ "Both samples of sorting were done using the same randomly created array with the same digit\n"
				+ "input. Subsequent times of running will show you varying runtimes in milliseconds.");


	}

}


