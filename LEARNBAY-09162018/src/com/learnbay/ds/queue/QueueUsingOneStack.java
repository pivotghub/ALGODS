package com.learnbay.ds.queue;


/**
 * @author n
 * 
 * Create a queue using one stack.
 * 
 * 
 * @see com.learnbay.ds.queue.QueueUsingStackDriver
 * @see com.learnbay.ds.stack.Stack
 *
 */
public class QueueUsingOneStack {

	/**
	 * stack to hold values
	 */
	java.util.Stack<Integer> st = new java.util.Stack<>();
	
	/**
	 * 
	 */
	public QueueUsingOneStack(){
		//nothing yet!
	}

	/**
	 * @param e
	 * 
	 * add an element
	 */
	public void enqueue(int e) {
		st.push(e);
	}
	
	/**
	 * remove an element
	 * 
	 * 
	 */
	public void dequeue() {
		recurssivePop();
	}
	
	/**
	 * Recurssive function. We have to keep removing/ popping the elements from the stack
	 * until we have one element left. Now just return that element and he remaining elements
	 * will be fetched and pushed back to the stack from subsequent recurssive calls.
	 * 
	 */
	private void recurssivePop() {
		
		if(st.size() == 0){
			return;  //Just return in case the stack is empty.
		}
		
		int top = st.pop();
		
		if(st.size() == 1){
			st.pop(); //In case we have just one element just pop it.
		}
		
		recurssivePop();
		st.push(top);
	}

	@Override
	public String toString() {
		return "QueueUsingOneStack [st=" + st + "]";
	}

	
	
	
	
}
