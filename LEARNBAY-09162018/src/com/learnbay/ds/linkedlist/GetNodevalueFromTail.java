package com.learnbay.ds.linkedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author n
 * 
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
 * 
 * Get value of a node from tail
 * 
 * @see GetNodevalueFromTail#getNode(SinglyLinkedListNode, int)
 * 
 * WARNING: THIS PROGRAM WORKS OK WITH "Test against custom inputs". But does not work while submitting.
 *
 */
public class GetNodevalueFromTail {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the getNode function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static int getNode(SinglyLinkedListNode head, int positionFromTail) {
		
		SinglyLinkedListNode current = head;
		
		
		/*First runner is always current (head) */
		SinglyLinkedListNode final_start_ptr = null;
		SinglyLinkedListNode start_ptr = head;
		SinglyLinkedListNode temp_ptr = null;
		int counter = 0;
		
		/* Trying to get the second pointer.
		 * 
		 * Keep it positionFromTail distance from start_ptr Let's both the pointers move at same pace.
		 * So that once the 2nd ptr reaches the end of the list the first pointer would have reached at the asked position. That is our answer
		 * 
		 * 
		 * */
		
		/*Just one element return the head.data*/
		if(current.next == null){
			return current.data;
		}
		
		if(positionFromTail == 0){
			temp_ptr = current;
		}
		
		/* get the second pointer.*/
		while(current.next != null && counter < positionFromTail){
			temp_ptr = current;
			current = current.next;
			counter++;
		}
		
		while(temp_ptr.next != null && start_ptr.next != null){
			final_start_ptr = start_ptr;
			start_ptr =  start_ptr.next;
			temp_ptr = temp_ptr.next;
		}
		
		if(positionFromTail == 0){
			System.out.println("answer: "+start_ptr.data);
			return start_ptr.data;
		}
		
		System.out.println("answer: "+final_start_ptr.data);
		return final_start_ptr.data;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\brac.txt"));

		int tests = scanner.nextInt();
		
		for (int testsItr = 0; testsItr < tests; testsItr++) {
			SinglyLinkedList llist = new SinglyLinkedList();

			int llistCount = scanner.nextInt();
			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();

				llist.insertNode(llistItem);
			}

			int position = scanner.nextInt();
			int result = getNode(llist.head, position);
			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
