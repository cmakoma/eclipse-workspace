package queueAndDequeue;
import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdOut;

public class Deque<Item> implements Iterable<Item> {
	private int N;
	private Node first;
	private Node last;
	
	
	private class Node {
		private Item item;
		private Node next;
		private Node previous;
	}
	
	
	public Deque() {									// construct an empty deque
		N = 0;
		first = null;
		last = null;
	}
	
	
    public boolean isEmpty() {							// is the deque empty?
		return N == 0;
    }
    
    
    public int size() {									// return the number of items on the deque
		return N;
    }
    
    
    public void addFirst(Item item) {					// insert the item at the front
    	if (item == null) throw new NullPointerException("item can't be null");
    	
    	Node oldFirst = first;
    	first = new Node();
    	first.item = item;
    	first.previous = null;
    	
    	if (isEmpty()) {
    		last = first;
    		first.next = null;
    		last.next = null;
    		last.previous = null;
    		
    	} else {
    		oldFirst.previous = first;
    		first.next = oldFirst;
    	}
    	N++;
    }
    
    
    public void addLast(Item item) {					// insert the item at the end
    	if (item == null) throw new NullPointerException("item can't be null");
    	
    	Node oldLast = last;
    	last = new Node();
    	last.item = item;
    	last.next = null;
    	
    	if (isEmpty()) first = last;
    	else {
    		oldLast.next = last;
    		last.previous = oldLast;
    	}
    	N++;
    }
    
   
    public Item removeFirst() {							// delete and return the item at the front
    	if (isEmpty()) throw new NoSuchElementException("Deque underflow");
    	
    	Item removeItem = first.item;
    	first = first.next;
    	
    	if (first != null) first.previous = null;
    	
    	N--;
    	
    	if (isEmpty()) last = null;
    	
    	return removeItem;
    }
    
    
    public Item removeLast() {
    	if (isEmpty()) throw new NoSuchElementException("Deque underflow");
    	
    	Item removeItem = last.item;
    	last = last.previous;
    	
    	if (last != null) last.next = null;
    	
    	N--;
    	
    	if (isEmpty()) first = null;
    	
    	return removeItem;
    }
	
	
    @Override
    public Iterator<Item> iterator() {						// return an iterator over items in order from front to end
		return new DequeIterator();
	}
	
	// Iterator. Doesn't implement remove() or forEachRemaining().
	private class DequeIterator implements Iterator<Item> {
		private Node current = first;
		
		
		@Override
		public void remove() { throw new UnsupportedOperationException(); }

		
		@Override
		public boolean hasNext() { return current != null; }

		
		@Override
		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
    public static void main(String[] args) {
    	Deque<String> myDeque = new Deque<>();
    	myDeque.addFirst("second");
    	myDeque.addFirst("3rd");
    	myDeque.addFirst("4th");
    	myDeque.addLast("first ");
    	myDeque.addLast("Zero");
    	
    	StdOut.println("\nSize: " + myDeque.size());
    	
    	for (String text : myDeque) StdOut.print(text + " ");
    	
    	StdOut.println("\n" + myDeque.removeFirst());
    	StdOut.println(myDeque.removeFirst());
    	StdOut.println(myDeque.removeLast());
    	StdOut.println(myDeque.removeFirst());
    	StdOut.println(myDeque.removeFirst() + "\n");
    	
    	myDeque.addFirst("Two");
    	myDeque.addFirst("Three");
    	myDeque.addFirst("Four");
    	myDeque.addLast("One");
    	myDeque.addLast("Zero");
    	
    	StdOut.println("\nSize: " + myDeque.size());
    	
    	for (String text : myDeque) {
    		text += " car";
    		StdOut.println(text);
    	}
    	
    	Iterator<String> iterator = myDeque.iterator();
    	
    	StdOut.println();
    	
    	StdOut.println(iterator.next());
    	StdOut.println(iterator.next());
    	StdOut.println(iterator.next());
    	StdOut.println(iterator.hasNext());
    	
    	StdOut.println("\n" + myDeque.removeLast());
    	StdOut.println(myDeque.removeLast());
    	StdOut.println(myDeque.removeFirst());
    	StdOut.println(myDeque.removeLast());
    	StdOut.println(myDeque.removeLast());
    	
    	StdOut.println("\n Size: " + myDeque.size());
    }
}