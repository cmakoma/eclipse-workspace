// Assignement DemoLinkedStack
// Program LinkedStack
// Author Christian Makoma
// Created Feb 6, 2020


package stack;

import java.util.Iterator;

public class LinkedStack <T> implements Iterable<T>{
	private Node<T> first = null;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(T item) {
		Node<T> oldFirst = first;
		first = new Node<T>(item, oldFirst);
	}
	
	public T pop() {
		if (first == null)
			throw new RuntimeException("Can't pop an empty stack");
		
		T item = first.item;
		first = first.next;
		return item;		
	}
	
	public T peek() {
		if (first == null)
			throw new RuntimeException("Can't peek an empty stack");
		
		return first.item;	
	}
	
	@Override
	public String toString() {
		Node<T> temp = first;
		if (temp == null)
			return ("[]");
		
		StringBuilder sb  = new StringBuilder("]");
		while(temp.next != null) {
			sb.insert(0, temp.item).insert(0, ", ");
			temp = temp.next;
		}
		sb.insert(0, temp.item).insert(0, "[");
		return sb.toString();	
	}
	
	private static class Node<T> {
		private T item;
		private Node<T> next;
		
		Node(T item, Node<T> next) {
			this.item = item;
			this.next = next;
		}
	}

	@Override
	public Iterator<T> iterator() {
	// TODO Auto-generated method stub
		return new LinkedStackIterator();
	}

	private class LinkedStackIterator implements Iterator<T>{
	private Node<T> current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
		T data = current.item;
		current = current.next;
		return data;
		}
	}

}
