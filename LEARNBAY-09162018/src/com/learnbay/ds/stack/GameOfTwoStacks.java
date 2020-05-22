package com.learnbay.ds.stack;

import java.util.Arrays;

/**
 * 
 * @author n
 * 
 *         https://www.hackerrank.com/challenges/game-of-two-stacks/problem
 *
 *Sample Input 0

1
5 4 10
4 2 4 6 1
2 1 8 5

Sample Output 0

4


 *
 *
 */
public class GameOfTwoStacks {

	private static final int NUM_THRESHOLD = 10;

	public static void main(String[] args) {

		int[] ar = new int[] { 4, 2, 4, 6, 1 };
		int[] br = new int[] { 2, 1, 8, 5 };

		int[] a = reverse(ar);
		int[] b = reverse(br);
		
		int sum = 0;
		
		int top = a.length - 1;
		int marker = a.length;

		/* Start from 5 and go till 2 */

		/* Part 1 */
		while (top >= 0 && (sum + a[top]) <= NUM_THRESHOLD) {
			sum += a[top];
			top--;
			marker--;
		}

		System.out.println(" sum is " + sum + " with top at position " + top + " marker at position " + marker);

		/*Please think of skipping this step*/
		int dest[] = reverse(Arrays.copyOfRange(a, marker, a.length));
		System.out.println("Temporary array: " + Arrays.toString(dest));
		
		/* End of Part 1 */

		
		/*
		 * Part 2
		 * 
		 * Local count is the temp array length that was from stack 1.
		 * 
		 * Now traverse the second array
		 * 
		 */
		int loc_cnt = dest.length;
		int fnl_cnt = dest.length;
		
		top = dest.length - 1;
		
		for (int i = b.length-1; i >= 0; i--) {

			sum += b[i]; 
			loc_cnt++; 

			/*
			 * If sum from the second stack does not exceed the threshold find
			 * the max between these two
			 */
			if (sum <= NUM_THRESHOLD) {
				fnl_cnt = Math.max(loc_cnt, fnl_cnt);
			}

			/*
			 * If sum exceeds the threshold then, take chatacters from the temp
			 * one by one. decrease local count
			 */
			while (sum > NUM_THRESHOLD && top != -1) {
				sum -= dest[top];
				loc_cnt--;
				top--;
			}

			if (sum > NUM_THRESHOLD && top == -1) {
				break;
			}
		}
		System.out.println("Final Count: " + fnl_cnt);
	}

	/**
	 * 
	 * 1, 2, 3 shall result in 3, 2, 1
	 * 
	 * @param nums
	 * @return
	 */
	public static int[] reverse(int[] nums) {
		int[] reversed = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			reversed[i] = nums[nums.length - 1 - i];
		}
		return reversed;
	}
}
