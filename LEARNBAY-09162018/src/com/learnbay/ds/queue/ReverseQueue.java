package com.learnbay.ds.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author n
 * 
 * 
 * 
 * 
Given a Queue A, you need to reverse the Queue


 * Input: 
The first line of input contains an integer T denoting the Test cases. Then T test cases follow. 
Second line contains value of N 
Third line a[i] elements

Output:
Array elements in reverse order

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
1 ≤ a[i] ≤ 10^5

Example:
Input : 
2
6
4 3 1 10 2 6
4
4 3 2 1 

Output : 
6 2 10 1 3 4
1 2 3 4
 *
 *
 *Take a help of a stack or use recurssion.
 *
 *
 */
public class ReverseQueue {

	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) {

		q.add(4);
		q.add(3);
		q.add(1);
		q.add(10);
		q.add(2);
		q.add(6);
		
		System.out.println("Original queue: "+q);
		new ReverseQueue().recurse();
		System.out.println("Queue after reverse: "+q);
	}

	/**
	 * Recursive call.
	 * 
	 */
	private void recurse() {

		int e = 0;
		if(q.size() == 0){
			return;
		}
		int top = q.poll();
		recurse();
		q.offer(top);
	}


}
