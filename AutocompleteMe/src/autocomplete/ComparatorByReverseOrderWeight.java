package autocomplete;

import java.util.Comparator;

public class ComparatorByReverseOrderWeight implements Comparator<Term> {

	@Override
	public int compare(Term o1, Term o2) {
		if(o1.weight == o2.weight) return 0;
		if(o1.weight > o2.weight) return -1;
		return 1;
	}

}
