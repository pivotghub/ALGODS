package com.learnbay.ds.linkedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author n
 * 
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
 * 
 * Delete node at any given position
 * 
 * @see DeleteNodeatPosition#deleteNode(SinglyLinkedListNode, int)
 *
 */
public class DeleteNodeatPosition {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     * 
     * edited
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

    	SinglyLinkedListNode ptr = head;
    	SinglyLinkedListNode current = null;
    	
    	int counter = 0;
    	
    	if(position == 0){
    		SinglyLinkedListNode cur = head.next;
    		head = cur;
    		cur = null;
    		return head;
    	}
    	
    	/*Locate the position.*/
    	while(ptr.next != null && counter < position){
    		current = ptr;
    		ptr = ptr.next;
    		counter++;
    	}
    	
    	/*De-link the required node.*/
    	SinglyLinkedListNode temp = ptr.next;
    	current.next = temp;
    	
    	return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\brac.txt"));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
}
