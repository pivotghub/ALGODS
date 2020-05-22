package com.learnbay.ds.queue;

public class QueueDriver {

	
	public static void main(String[] args){
		
		/*Queue queue = new Queue(5);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.enQueue(1);
		queue.print();
		
		queue.deQueue();
		queue.deQueue();
		
		queue.print();*/
		
		
		
		//CircularQueue Driver not a generic one.
		CircularQueue circularQueue = new CircularQueue(8);

		circularQueue.enQueue(15);
		circularQueue.enQueue(16);
		circularQueue.enQueue(17);
		circularQueue.enQueue(18);
		circularQueue.enQueue(19);
		circularQueue.enQueue(20);
		circularQueue.enQueue(21);
		circularQueue.enQueue(22);

		System.out.println("Full Circular Queue");
		circularQueue.print();

		System.out.print("Dequeued following element from circular Queue ");
		circularQueue.deQueue();
		
		circularQueue.enQueue(23);
		System.out.println("After enqueueing circular queue with element having value 23");
		circularQueue.print();
		circularQueue.deQueue();
		circularQueue.enQueue(233);
		circularQueue.print();
		circularQueue.enQueue(12);
		circularQueue.print();
		
	}
}
