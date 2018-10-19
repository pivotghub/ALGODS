package com.learnbay.ds.linkedlist;

/**
 * @author n
 * 
 * 
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
 * 
 * 
 * Given pointers to the head nodes of  linked lists that merge together at some point, find the Node where the two lists merge. It is guaranteed that the two head Nodes will be different, and neither will be NULL.

	In the diagram below, the two lists converge at Node x:

		[List #1] a--->b--->c
                     \
                      x--->y--->z--->NULL
                     /
     	[List #2] p--->q
	Complete the int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) method so that it finds and returns the data value of the Node where the two lists merge.
 *
 */
import java.io.*;
import java.util.*;

public class MergePointofTwoLists {

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

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    	if(head1 == null || head2 == null){
    		return 0;
    	}
    		
    	SinglyLinkedListNode ptr1 = head1;
    	SinglyLinkedListNode ptr2 = head2;
    	
    	while(ptr1 != ptr2){
    		
    		if(ptr1.next != null){
        		ptr1 = ptr1.next;
        	}
    		else{
    			ptr1 = ptr2;
    		}
    		
    		if(ptr2.next != null){
        		ptr2 = ptr2.next;
        	}
    		else{
    			ptr2 = ptr1;
    		}
    	}
    	
    	return ptr2.data;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\brac.txt"));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
            
          	SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            int result = findMergeNode(llist1.head, llist2.head);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

