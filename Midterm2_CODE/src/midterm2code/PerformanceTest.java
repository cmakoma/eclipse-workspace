package midterm2code;

import java.util.Random;

import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdOut;

public class PerformanceTest {
	private static final Random rand = new Random();

	public static void main(String[] args) {
		StdOut.printf("%-12s  %-12s  %-12s  %n", "number of", "time to","time to" );
		StdOut.printf("%-12s  %-12s  %-12s  %n", "integers", "mergesort","mergesortSlowSort");
		StdOut.println("---------------------------------------------");

		for (int i = 1000; i <= 128000; i *= 2) {
			Integer[] numbers = getRandomIntArray(i);
			
			Stopwatch stopwatch = new Stopwatch();
			Merge.sort(numbers);
			double timeToSort = stopwatch.elapsedTime();
			MergeSlow.sort(numbers);
			double timeToSort2 = stopwatch.elapsedTime();
			
			StdOut.printf("%-12d  %-12.3f  %-12.3f %n", i, timeToSort, timeToSort2);
			
		}
		
		StdOut.println("T H E   E N D");
	}

	private static Integer[] getRandomIntArray(int size) {
		Integer[] array = new Integer[size];
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(size);
		}
		return array;
	}
	
	
}


// the parfomance test is displaying the result of a two consecutive sort
// merge sort algorithm, then using the modified merge sort algorithm 
// from class MergeSlow.