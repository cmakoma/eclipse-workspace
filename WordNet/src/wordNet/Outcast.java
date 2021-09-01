package wordNet;

import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.ST;


public class Outcast {

	private WordNet wn;
	
	
	public Outcast(WordNet wordnet){
		this.wn = wordnet;
	}
 
	
	public String outcast(String[] nouns){
		ST<Integer, String> st = new ST<>();
		MaxPQ<Integer> maxPQ = new MaxPQ<>();
		
		for(int i=0; i<nouns.length; i++){
			int distance = 0;
			for(int j=0; j<nouns.length; j++){
				distance += wn.distance(nouns[i], nouns[j]);
			}
			maxPQ.insert(distance);
			
			st.put(distance, nouns[i]);
		}
		return st.get(maxPQ.max());
	}
   
	public static void main(String[] args){
		String[] outcast5 = {"horse", "zebra", "cat", "bear", "table"};
		String[] outcast8 = {"water", "soda", "bed", "orange_juice", "milk", "apple_juice", "tea", "coffee"};
		String[] outcast11 = {"apple", "pear","banana", "lime","lemon","blueberry","strawberry","mango","watermelon","potato"};
		WordNet wordnet = new WordNet("wordNet/synsets.txt", "wordNet/hypernyms.txt");
	    Outcast outcast = new Outcast(wordnet);
	    
	    System.out.println("%more outcast5.text");
	    for (int t = 0; t < outcast5.length; t++) {
	        System.out.print(outcast5[t]+" ");
	    }
	    System.out.print(": " + outcast.outcast(outcast5) +" \n");
	    
	    System.out.println("\n%more outcast8.text");
	    for (int t = 0; t < outcast8.length; t++) {
        System.out.print(outcast8[t]+ " ");
	    }
	    System.out.println(": " + outcast.outcast(outcast8));
    
    	System.out.println("\n%more outcast11.text");
    	for (int t = 0; t < outcast11.length; t++) {
        System.out.print(outcast11[t]+ " ");
    	}
    	System.out.println(": " + outcast.outcast(outcast11));
    
	}
}
