package com.learnbay.ds.stack;

/**
 * @author n
 * 
 * Stack using one queue.
 *
 */
public class StackUsingQueueDriver {

	public static void main(String[] args) {
		
		StackQ s = new StackQ();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s);
		
		s.push(3);
		s.push(9);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
	}

}
