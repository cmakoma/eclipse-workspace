// Assignement CE_ElementaryST_and_Heap_CODE
// Program DemoHeap
// Author Christian Makoma
// Created Mar 3, 2020


package heapSort;

import edu.princeton.cs.algs4.MinPQ;

public class DemoHeap {

	public static void main(String[] args) {
		MinPQ<Mail> mpq = new MinPQ<Mail>();
		
		for(int i = 0; i < 25; i++) {
			mpq.insert(new Mail());
		}
		
		System.out.println("Elements in the priority queue:");
		
		for(Mail m: mpq) {
			System.out.println(m);
		}
		System.out.println();
		System.out.println("Remove elements one by one from the priority queue:");
		
		
		for(Mail m: mpq) {
			System.out.println(mpq.delMin());
		}
	}

}
