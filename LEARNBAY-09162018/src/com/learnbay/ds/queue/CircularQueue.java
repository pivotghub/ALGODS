package com.learnbay.ds.queue;

import java.util.Arrays;

/**
 * @author n
 * 
 * This is a circular queue using an array. We are using modulo here to target the rear in case of enque and front 
 * in case of dequeue. This is just a queue having operations such as enque, deque, isFull, isEmpty and size.
 * 
 * 
 * @see QueueDriver
 *
 */
public class CircularQueue {

	private int[] arr;
	private int front = 0;
	private int rear  = -1;
	private int size  = 0;
	
	/**
	 * @param capacity
	 * 
	 * intial size of the array.
	 */
	public CircularQueue(int capacity) {
		arr = new int[capacity];
	}

	/**
	 * @param e
	 * 
	 * input element.
	 * 
	 */
	public void enQueue(int e) {
		
		if(isFull()){
			System.out.println("Overflow ! Could not add element: "+e);
		}
		else{
			rear = (rear + 1) % arr.length;
			arr[rear] = e;
			size++;
            System.out.println("Element " + e+ " is pushed to the Queue !");
		}
	}

	/**
	 * @param take element off
	 * 
	 */
	public void deQueue() {
		if(isEmpty()){
			System.out.println("Underflow ! Could not remove element from Queue");
		}
		else{
			System.out.println("Pop operation done ! removed: "+arr[front]);
			front = (front + 1) % arr.length;
			size--;
		}
	}
	
	/**
	 * @return boolean
	 */
	private boolean isEmpty() {
		return size == 0;
	}

	/**
	 * @return boolean
	 * 
	 * the queue is full when the element when the rear equals to the length of the array.
	 */
	private boolean isFull() {
		return size == arr.length;
	}


	/**
	 * Just print the cur current elements
	 */
	public void print() {
		System.out.println("Actual array view: "+Arrays.toString(arr));
	}
	
	
	
}
