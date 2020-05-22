package com.learnbay.ds.queue;

/**
 * @author n
 * 
 * Create a queue using two stacks
 *
 */
public class QueueUsingTwoStacks {
	
	java.util.Stack<Integer> stack1 = new java.util.Stack<>();
	java.util.Stack<Integer> stack2 = new java.util.Stack<>();

	/**
	 * @param e
	 * 
	 * add an element
	 * 
	 */
	public void enqueue(int e) {
		stack1.push(e);
		
	}

	/**
	 * remove an element
	 */
	public void dequeue() {
		
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		stack2.pop();
	}

	@Override
	public String toString() {
		return "QueueUsingTwoStacks [stack1=" + stack1 + ", stack2=" + stack2 + "]";
	}

	
	
}
