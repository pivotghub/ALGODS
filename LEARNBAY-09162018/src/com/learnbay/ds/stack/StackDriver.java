package com.learnbay.ds.stack;

public class StackDriver {

	public static void main(String[] args) {

		Stack stack = new Stack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		System.out.println(stack);
		
		stack.peek();
		
	}

}
