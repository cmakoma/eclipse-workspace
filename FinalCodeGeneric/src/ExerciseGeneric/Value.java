// Assignement FinalCodeGeneric
// Program Vakue
// Author Christian Makoma
// Created Dec 9, 2019


package ExerciseGeneric;

public class Value <V extends Comparable<V>> implements Comparable<Value <V>>{
	private V value;
	
	public Value(V value) {
		super();
		this.value = value;
		
	}


	public V getValue() {
		return value;
	}


	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.value);
	}


	@Override
	public int compareTo(Value<V> o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
