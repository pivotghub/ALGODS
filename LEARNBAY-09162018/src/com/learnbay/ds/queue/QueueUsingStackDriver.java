package com.learnbay.ds.queue;


/**
 * @author n
 * 
 * Test creation of queue using one or two stack(s).
 *
 */
public class QueueUsingStackDriver {

	public static void main(String[] args) {

		//Queue using one stack.
		QueueUsingOneStack qt = new QueueUsingOneStack();
		qt.enqueue(1);
		qt.enqueue(2);
		qt.enqueue(3);
		System.out.println(qt);
		
		qt.dequeue();
		System.out.println(qt);
		
		//Queue using two stacks.
		QueueUsingTwoStacks qt2 = new QueueUsingTwoStacks();
		qt2.enqueue(1);
		qt2.enqueue(2);
		qt2.enqueue(3);
		System.out.println(qt2);
		
		qt2.dequeue();
		qt2.dequeue();
		System.out.println(qt2);
		
		
	}

}
