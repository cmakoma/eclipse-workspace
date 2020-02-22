// Assignement DemoLinkedStack
// Program LinkedStackApp
// Author Christian Makoma
// Created Feb 6, 2020


package stack;

public class LinkedStackApp {

	public static void main(String[] args) {
		
		LinkedStack <String> stack = new LinkedStack<>();
		stack.push("hey ");
		stack.push("Big ");
		stack.push("Boss ");
		
		
//		System.out.print(stack);
		
		for (String s: stack) 
		{ 
			System.out.println(s);
		}

	}

}
