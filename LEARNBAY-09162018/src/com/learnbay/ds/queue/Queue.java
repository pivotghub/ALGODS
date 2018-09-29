package com.learnbay.ds.queue;

import java.util.Arrays;

/**
 * @author n
 * 
 * Custom queue implementation using an array
 * 
 * This will have four operations - enqueue, dequeu, isEmpty, isFull and size
 *
 */
public class Queue {

	private int[] arr;
	private int front = 0;
	private int rear = -1;
	private int size = 0;
	
	/**
	 * @param capacity
	 * 
	 * intial size of the array.
	 */
	public Queue(int capacity) {
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
			System.out.println("Overflow ! Unable to add element: "+e);
		}
		else{
			rear++;
			arr[rear] = e;
			size++;
            System.out.println("Element " + e+ " is pushed to the Queue !");
		}
	}

	/**
	 * @param eake element off
	 * 
	 * t
	 */
	public void deQueue() {
		if(isEmpty()){
			System.out.println("Underflow ! Unable to remove element from Queue");
		}
		else{
			System.out.println("Pop operation done ! removed: "+arr[front]);
			front++;
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
		return rear == arr.length - 1;
	}


	/**
	 * Just print the cur current elements
	 */
	public void print() {
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, front, rear + 1)));
	}
	
	
	
}
