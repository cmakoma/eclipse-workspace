package queueAndDequeue;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdOut;

public class Subset {
	public static void main(String[] args) {
		
		int k = 3;
		RandomizedQueue<String> input = new RandomizedQueue<>();
		
		input.enqueue("a");
		input.enqueue("b");
		input.enqueue("c");
		input.enqueue("d");
		input.enqueue("e");
		
		StdOut.println("Current String:");
		Iterator<String> iterator = input.iterator();
		
		for (String s : input) {
			StdOut.println(s);
		}
		
		StdOut.println();
		StdOut.println();
		
		StdOut.println("Printing 3 element from the queue: ");
		for (int i = 0; i < k; i++) {
			StdOut.println(iterator.next());
		}
	}
}
	