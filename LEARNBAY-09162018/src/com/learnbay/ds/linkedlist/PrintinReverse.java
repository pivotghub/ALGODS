package com.learnbay.ds.linkedlist;

import java.util.Scanner;

/**
 * @author n
 * 
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
 * 
 * Print a reverse linkedlist
 *
 */
public class PrintinReverse {
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

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
		while (node != null) {
			System.out.print(node.data);

			node = node.next;

			if (node != null) {
				System.out.print(sep);
			}
		}
	}

	// Complete the reversePrint function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 * 
	 * HEAD -> 1 -> 2 -> 3 -> TAIL    to   HEAD -> 3 -> 2 -> 1 -> TAIL
	 *
	 */
	static void reversePrint(SinglyLinkedListNode head) {

		SinglyLinkedListNode current = head;
		SinglyLinkedListNode temp = head;
		SinglyLinkedListNode prev = null;
		
		while(temp != null){
			temp = current.next;
			current.next = prev;
			prev = current;
			if(temp != null){
				current = temp;
			}
		}
		head = current;
		print(head);
	}

	private static void print(SinglyLinkedListNode head) {

		SinglyLinkedListNode node = head;
			    while (node != null){
			    	System.out.println(node.data);
			        node = node.next;
			    }
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int testsItr = 0; testsItr < tests; testsItr++) {
			SinglyLinkedList llist = new SinglyLinkedList();

			int llistCount = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist.insertNode(llistItem);
			}

			reversePrint(llist.head);
		}

		scanner.close();
	}
}
