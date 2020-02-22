import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Assignement CE_Stack
// Program Test
// Author Christian Makoma
// Created Feb 4, 2020

public class Test {

	public static void main(String[] args) {
		   String s = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
	        evaluateAndPrintResult(s);
	    }

	private static void evaluateAndPrintResult(String s) {
		String[] str = s.split("\\s+");
	    Queue<String> q = new LinkedList<>();
	    
	    q.addAll(Arrays.asList(str));
	    Stack<String> ops = new Stack<>();
	    Stack<Double> vals = new Stack<>();
	    
	    while (!q.isEmpty()) {
	        String token = q.poll();
	        
	        if (token.equals("(")) {
	        } else if (token.equals("+")) {
	            ops.push(token);
	        } else if (token.equals("-")) {
	            ops.push(token);
	        } else if (token.equals("*")) {
	            ops.push(token);
	        } else if (token.equals(")")) { 
	        	
	            double v = vals.pop();
	            String op = ops.pop();
	            if (op.equals("+")) {
	                v = vals.pop() + v;
	            } else if (op.equals("-")) {
	                v = vals.pop() - v;
	            } else if (op.equals("*")) {
	                v = vals.pop() * v;
	            }
	            vals.push(v);
	        } else {
	            
	            vals.push(Double.parseDouble(token));
	        }
	    }
	    System.out.println(vals.pop());
	}

}
