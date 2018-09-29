package com.learnbay.ds.queue;

public class QueueDriver {

	
	public static void main(String[] args){
		
		Queue queue = new Queue(5);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.print();
		
		queue.deQueue();
		queue.deQueue();
		
		queue.print();
	}
}
