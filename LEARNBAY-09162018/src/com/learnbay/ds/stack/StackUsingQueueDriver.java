package com.learnbay.ds.stack;

/**
 * @author n
 * 
 * Stack using one queue.
 *
 */
public class StackUsingQueueDriver {

	public static void main(String[] args) {
		
		//One Queue
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
		
		
		//Two Queues
		StackUsingDualQueue sdq = new StackUsingDualQueue();
		sdq.push(1);
		sdq.push(2);
		sdq.push(3);
		System.out.println(sdq);
		
		sdq.pop();
		System.out.println(sdq);
		
		
	}

}
