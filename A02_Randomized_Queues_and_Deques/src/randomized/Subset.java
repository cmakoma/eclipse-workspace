// Assignement A02_Randomized_Queues_and_Deques
// Program Subset
// Author Christian Makoma
// Created Mar 6, 2020


package randomized;



import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Subset {

    private static String readFromStdIn() {
        return StdIn.readString();
    }

    private static void process(final int k) {
        final RandomizedQueue<String> queue = new RandomizedQueue<String>();
        int i = 0;
        while (!StdIn.isEmpty()) {
            i += 1;
            final String value = StdIn.readString();
            if (queue.size() < k) {
                queue.enqueue(value);
            } else if (StdRandom.uniform(0, i) < k) {
                queue.dequeue();
                queue.enqueue(value);
            }
        }
        final Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        final int k = Integer.valueOf(args[0]);
        if (k > 0) {
            process(k);
        }
    }
}