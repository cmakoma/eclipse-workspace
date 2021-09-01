package autocomplete;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Quick3way;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public final class Autocomplete {
	private final Term[] terms;
	
	// Initialize the data structure from the given array of terms.
    public Autocomplete(Term[] terms) {
    	if (terms == null) throw new NullPointerException("Terms can't be null");
    	this.terms = new Term[terms.length];
    	for (int i = 0; i < terms.length; i++) 
    		this.terms[i] = terms[i];
    	Quick3way.sort(this.terms);
    }

    // Return all terms that start with the given prefix, in descending order of weight.
    public Term[] allMatches(String prefix) {
    	if (prefix == null) throw new NullPointerException("Prefix can't be null");
    	
    	int firstIndex = BinarySearchDeluxe.firstIndexOf(terms, new Term(prefix, 0), Term.byPrefixOrder(prefix.length()));
    	if (firstIndex == -1) return new Term[0];
    	int lastIndex  = BinarySearchDeluxe.lastIndexOf (terms, new Term(prefix, 0), Term.byPrefixOrder(prefix.length()));
    	Term[] matchTerms = new Term[1 + lastIndex - firstIndex];
    	
    	for (int i = 0; i < matchTerms.length; i++)
    		matchTerms[i] = terms[firstIndex++];

    	Arrays.sort(matchTerms, Term.byReverseWeightOrder());
    	
		return matchTerms;
    }

    // Return the number of terms that start with the given prefix.
    public int numberOfMatches(String prefix) {
    	if (prefix == null) throw new NullPointerException("Prefix can't be null");
		return 1 + 
				BinarySearchDeluxe.lastIndexOf (terms, new Term(prefix, 0), Term.byPrefixOrder(prefix.length())) - 
				BinarySearchDeluxe.firstIndexOf(terms, new Term(prefix, 0), Term.byPrefixOrder(prefix.length()));
    }
    
    public static void main(String[] args) {

        // read in the terms from a file
        String filename = "/cities.txt";
        In in = new In(filename);
        int N = in.readInt();
        Term[] terms = new Term[N];
        for (int i = 0; i < N; i++) {
            double weight = in.readDouble();       // read the next weight
            in.readChar();                         // scan past the tab
            String query = in.readLine();          // read the next query
            terms[i] = new Term(query, weight);    // construct the term
        }

        // read in queries from standard input and print out the top k matching terms
//        int k = Integer.parseInt(args[1]);
//        int k = Integer.parseInt(args[1]);
        int k = 100000;
        Autocomplete autocomplete = new Autocomplete(terms);
        while (StdIn.hasNextLine()) {
            String prefix = StdIn.readLine();
            Term[] results = autocomplete.allMatches(prefix);
            for (int i = 0; i < Math.min(k, results.length); i++)
                StdOut.println(results[i]);
        }
    }
}
