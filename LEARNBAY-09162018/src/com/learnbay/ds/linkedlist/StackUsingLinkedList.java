package com.learnbay.ds.linkedlist;

/**
 * @author n
 * 
 * 
 * Build a stack using linkedlist
 *
 */
public class StackUsingLinkedList {

	private Node head; // the first node

	private class Node {
		int value;
		Node next;
	}

	/**
	 * initialized head to null
	 * 
	 */
	public StackUsingLinkedList() {
		head = null;
	}

	
	
	/**
	 * @return int
	 * 
	 * Remove value from the beginning of the list for demonstrating behaviour of stack
	 * 
	 * 
	 */
	public int pop() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		}
		int value = head.value;
		head = head.next;
		return value;
	}

	
	/**
	 * @param value
	 * 
	 * Add value to the beginning of the list for demonstrating behaviour of stack
	 * 
	 * 
	 */
	public void push(int value) {
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next = oldHead;
	}

	public static void main(String args[]) {
		StackUsingLinkedList lls = new StackUsingLinkedList();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		System.out.println("Element removed from LinkedList: " + lls.pop());
		System.out.println("Element removed from LinkedList: " + lls.pop());
		lls.push(10);
		System.out.println("Element removed from LinkedList: " + lls.pop());
		printList(lls.head);
	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
}
