// Assignement FinalCodeGeneric
// Program Test
// Author Christian Makoma
// Created Dec 9, 2019


package ExerciseGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Original Lists:");
		Value<String> p1= new Value<>("a");
		Value<String> p2= new Value<>("b");
		Value<String> p3= new Value<>("c");
		Value<String> p4= new Value<>("d");
		Value<String> p5= new Value<>("e");
		Value<String> p6= new Value<>("f");
		Value<String> p7= new Value<>("g");
		
		Value<Double> d1= new Value<>(1.1);
		Value<Double> d2= new Value<>(2.2);
		Value<Double> d3= new Value<>(3.3);
		Value<Double> d4= new Value<>(4.4);
		Value<Double> d5= new Value<>(5.5);
		Value<Double> d6= new Value<>(6.6);
		Value<Double> d7= new Value<>(7.7);
		
		List<Value> enterValues = new ArrayList<Value>();
		enterValues.add(p1);
		enterValues.add(p2);
		enterValues.add(p3);
		enterValues.add(p4);
		enterValues.add(p5);
		enterValues.add(p6);
		enterValues.add(p7);
		
		List<Value> enterValues2 = new ArrayList<Value>();
		enterValues2.add(d1);
		enterValues2.add(d2);
		enterValues2.add(d3);
		enterValues2.add(d4);
		enterValues2.add(d5);
		enterValues2.add(d6);
		enterValues2.add(d7);
		
		System.out.println("number:" + enterValues2 );
		System.out.println("Letters:" + enterValues);
		System.out.println();
		
		
		;
		
		removeEveryOtherElement(enterValues2);
		removeEveryOtherElement(enterValues);
		
		System.out.println("After removing:");
		System.out.println("number:"+ enterValues2);
		System.out.println("Letters:"+ enterValues);

	}
	
	// method removeEveryOtherElement
	private static void removeEveryOtherElement(List<Value> l) {

		for(int i = 1; i < l.size(); i +=2) {
			
			l.remove(l.get(i));
			
		}
		
	}

}
