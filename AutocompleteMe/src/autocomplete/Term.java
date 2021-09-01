package autocomplete;

import java.util.Arrays;
import java.util.Comparator;

public class Term implements Comparable<Term> {

    // Initialize a term with the given query string and weight.
	final String query;
	final double weight;
	
	 public Term(String query, double weight) {
			super();
			if (query == null) throw new NullPointerException("Query cannot be null");
			if (weight < 0) throw new IllegalArgumentException("weight must not be less than 0");
			this.query = query;
			this.weight = weight;
		}

    // Compare the terms in descending order by weight.
    public static Comparator<Term> byReverseWeightOrder(){
    	return new ComparatorByReverseOrderWeight();
    }

    // Compare the terms in lexicographic order but using only the first r characters of each query.
    public static Comparator<Term> byPrefixOrder(int r){
    	if (r < 0) throw new IllegalArgumentException("r must not be less than 0");
		return new ComparatorByPrefixOrderQuery(r);
    }

    // Compare the terms in lexicographic order by query.
    public int compareTo(Term that) {
    	return this.query.compareTo(that.query);
    }

    // Return a string representation of the term in the following format:
    // the weight, followed by a tab, followed by the query.
    public String toString() {
    	return weight + "\t" + query;
    }
    
    public static void main(String[] args) {
		Term[] terms = {new Term("christian", 4), new Term("David", 5.44), new Term("ALpha", 12), new Term("Acccbfv", 0.01)};
		
		System.out.println("Terms:");
		for (Term term : terms) System.out.println(term);
		System.out.println();
		
		System.out.println("Term terms by byReverseWeightOrder :");
		Arrays.sort(terms, Term.byReverseWeightOrder());
		for (Term term : terms) System.out.println(term);
		System.out.println();
		
		System.out.println("Term terms by byPrefixOrder(2) :");
		Arrays.sort(terms, Term.byPrefixOrder(4));
		for (Term term : terms) System.out.println(term);
		System.out.println();
		
		System.out.println("Term terms by Sort :");
		Arrays.sort(terms);
		for (Term term : terms) System.out.println(term);
	}
}