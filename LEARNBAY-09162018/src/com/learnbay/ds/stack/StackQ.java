package com.learnbay.ds.stack;

import java.util.LinkedList;

/**
 * @author n
 * 
 * Construction of a stack using just one queue (java.util.LinkedList implementation).
 * 
 * Please try this with a custom Queue implementation.
 *
 */
public class StackQ {

	java.util.Queue<Integer> q = new LinkedList<>();
	
	public StackQ(){
		//nothing yet
	}
	
	public int push(Integer e){
			
		int size = q.size();
		q.offer(e);
		for(int i = 0; i < size; i++){
			q.add(q.remove());
		}
		return e;
	}

	public int pop(){
		return q.remove();
	}
	
	public void peek(){
		q.peek();
	}
	
	public boolean isEmpty(){
		return q.isEmpty();
	}

	@Override
	public String toString() {
		return "StackQ [q=" + q + "]";
	}
	
	
}
