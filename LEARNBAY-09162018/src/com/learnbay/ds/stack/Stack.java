package com.learnbay.ds.stack;

import java.util.Arrays;

/**
 * @author n
 * 
 * Custom STACK implementation using an array
 * 
 * 
 * {@link StackDriver.class}
 *
 */
public class Stack {
 
	int[] arr;
	int top = -1; //as the array is empty initially.
	
	
	public Stack(int size) {
		arr = new int[size]; // initial size of an array.
	}

	public void push(int val) {
		
		if(!isFull()){
			arr[++top] = val; // if not full -  adding value to the array and incrementing the pointer position.
		}
	}

	public void pop() {
		if(!isEmpty()){
			arr[top--] = 0;	// if not empty just decrease the pointer position.
		}
	}
	
	public void peek() {
		System.out.println(arr[arr.length-1]);  // see the top element without removing it.
	}

	public boolean isFull(){
		return top == arr.length-1;   //pointer is at top position.
	}
	
	public boolean isEmpty(){
		return top == -1; 	//point is reset.
	}
	

	public String toString() {
		return "arr=" + Arrays.toString(arr);
	}

	

	

}
