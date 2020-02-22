// Assignement CE_Elementary_Sorts
// Program test
// Author Christian Makoma
// Created Feb 11, 2020


package sort;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
		 Integer[] a = new Integer[]{41, 48, 96, 41, 14, 10, 32, 47, 62};
		 
		 System.out.println("Random Integer array before Sorting :" + Arrays.toString(a));
		 Insertion.sort(a);
		 System.out.println("Sorted array using insertion sort :" + Arrays.toString(a));
		 System.out.println();
		 
		 String[] b = new String[]{"London", "Paris", "Tokyo", "NewYork", "Chicago"};
		 System.out.println("String array before sorting :" + Arrays.toString(b));
		 Insertion.sort(b);
		 System.out.println("String array after sorting :" + Arrays.toString(b));

		 
	}

}
