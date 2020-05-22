package com.learnbay.ds.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author n
 * 
 * Stack using dual queue. push O(1) and pop O(n) operations.
 * 
 * 
 *
 */
public class StackUsingDualQueue {
	
	/*LinkedList based queue*/
	java.util.Queue<Integer> queue1 = new LinkedList<>();
	java.util.Queue<Integer> queue2 = new LinkedList<>();
	
	/**
	 * To keep track of the last element enqued so that it can be used to transfer it to another queue.
	 */
	int top = 0;
	
	public StackUsingDualQueue() {
		//nothing yet
	}

	/**
	 * 
	 * @param element
	 * 
	 * add element to the queue/ stack
	 * 
	 * Just add elements and keep track of the last element enqueued. O(1) for push/ enqueue operation
	 * 
	 */
	public void push(int e) {
		queue1.add(e);
		top = e;
	}
	
	/**
	 * 
	 * @param e
	 * 
	 * remove element from stack/ queue
	 * 
	 * Remove all the elements except the last/ the one that has to be popped first. Transfer it to the other
	 * queue and pop it from there. The trasfer of the element(s) from one queue to the other takes O(n)
	 * 
	 */
	public void pop(){
		while(queue1.size() > 1){
			queue2.add(queue1.remove());
		}
		queue1.remove();
		Queue<Integer> t = queue1;
		queue1 = queue2;
		queue2 = t;
	}

	
	
	@Override
	public String toString() {
		return "StackUsingDualQueue [queue=" + queue1 + "]";
	}
	
}
