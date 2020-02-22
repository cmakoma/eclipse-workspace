// Assignement CE_Merge_CODE
// Program Test
// Author Christian Makoma
// Created Feb 13, 2020


package merge;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Integer[]arrayA = new Integer[] {2, 15, 22, 47, 51};
		Integer[]arrayB = new Integer[] {14,18, 26, 45, 49, 56, 78};
		Integer[]arrayC = new Integer[arrayA.length + arrayB.length];
		int[]arrayD = new int[] {96, 51, 20, 98, 38, 73, 23, 22, 47, 30};
		
		System.out.println("Array a: "+ Arrays.toString(arrayA));
		System.out.println("Array b: "+ Arrays.toString(arrayB));
		
		merge(arrayA,arrayB,arrayC);
		
		System.out.println("2. Sort an array  "+ Arrays.toString(arrayD)+ "  using the Mergesort algorithm.");

		sorting.mergeSort(arrayD);
		System.out.println("Sorted array with Mergesort"+ Arrays.toString(arrayD));
	

	}

	private static void merge(Integer[] arrayA, Integer[] arrayB, Integer[] arrayC) {
		
		int i = 0;
		int j = 0;
		for(int k = 0; k < arrayC.length; k++) {
			
			if(i >= arrayA.length || arrayA[i] > arrayB[j]) {
				arrayC[k] = arrayB[j];
				j++;
			}
			else if(i >= arrayB.length || arrayA[i] < arrayB[j] || i == 4) {
				arrayC[k] = arrayA[i];
				i++;	
			}		
			
		}

		System.out.println("Array c: " + Arrays.toString(arrayC));
		System.out.println();
		
	}

}
