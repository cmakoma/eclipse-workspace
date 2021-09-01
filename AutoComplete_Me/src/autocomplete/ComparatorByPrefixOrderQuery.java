package autocomplete;

import java.util.Comparator;

public class ComparatorByPrefixOrderQuery implements Comparator<Term> {

	private int r;
	
	ComparatorByPrefixOrderQuery(int r) {
		this.r = r;
	}

	@Override 
	public int compare(Term a, Term b) {
		String prefixA;
		String prefixB;
		
		if (a.query.length() < r) prefixA = a.query;
		else prefixA = a.query.substring(0, r);
		
		if (b.query.length() < r) prefixB = b.query;
		else prefixB = b.query.substring(0, r);

		return prefixA.compareTo(prefixB);
	}
}
